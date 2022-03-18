<script>
import axios from "axios";
import flatpickr from "flatpickr";
import "flatpickr/dist/flatpickr.min.css";
import dateFormat from "dateformat";

export default {
  data() {
    return {
      msg: "Home",
      date: "2022-02-02",
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
          name: "axios6",
          time: "2022-03-17T20:24:01",
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
      <div class="col-md-12">
        <input type="text" class="form-control" ref="mydate" v-model="date" />
      </div>
    </div>
  </div>
</template>
