<script>
import axios from "axios";

export default {
  data() {
    return {
      msg: "Home",
    };
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
  <button type="button" class="btn btn-primary" @click="get()">Get</button>
  &nbsp;
  <button type="button" class="btn btn-primary" @click="post()">Post</button>
</template>
