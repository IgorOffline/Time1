<script>
import axios from "axios";
import flatpickr from "flatpickr";
import "flatpickr/dist/flatpickr.min.css";
import dateFormat from "dateformat";

export default {
  data() {
    return {
      msg: "Home",
      name: "axios",
      date: "2022-02-02",
      time: "17:00",
    };
  },
  mounted() {
    this.date = dateFormat(new Date(), "yyyy-mm-dd");
    flatpickr(this.$refs.mydate, {
      defaultDate: this.date,
    });
  },
  methods: {
    get() {
      axios.get("http://localhost:8090/demo1").then((response) => {
        this.msg = response.data;
      });
    },
    post() {
      axios
        .post("http://localhost:8090/demo1", {
          name: this.name,
          time: `${this.date}T${this.time}`,
        })
        .then((response) => {
          console.log(response);
          this.msg = response.data;
        })
        .then((err) => console.log(err));
    },
  },
};
</script>

<template>
  <h1>{{ msg }}</h1>
  <hr />
  <div class="form-group">
    <div class="row">
      <div class="col-md-6">
        <button
          type="button"
          class="btn btn-primary form-control"
          @click="get()"
        >
          Get
        </button>
      </div>
      <div class="col-md-6">
        <button
          type="button"
          class="btn btn-primary form-control"
          @click="post()"
        >
          Post
        </button>
      </div>
    </div>
    <div class="row">
      <div class="col-md-4">
        <input type="text" class="form-control" v-model="name" />
      </div>
      <div class="col-md-4">
        <input type="text" class="form-control" ref="mydate" v-model="date" />
      </div>
      <div class="col-md-4">
        <input type="text" class="form-control" v-model="time" />
      </div>
    </div>
  </div>
</template>
