<script>
import { Collapse } from "bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";

export default {
  data() {
    return {
      myNavbarToggler: undefined,
    };
  },
  mounted() {
    const navbarToggler = document.getElementById("navbarToggler");
    this.myNavbarToggler = new Collapse(navbarToggler);
  },
  methods: {
    toggleNavbarToggler() {
      if (window.innerWidth < 576) {
        this.myNavbarToggler.toggle();
      }
    },
  },
};
</script>

<template>
  <main>
    <header class="d-flex flex-column h-100">
      <nav class="navbar navbar-expand-sm navbar-dark fixed-top bg-dark">
        <button
          class="navbar-toggler"
          type="button"
          data-toggle="collapse"
          data-target="#navbarToggler"
          aria-controls="navbarToggler"
          aria-expanded="false"
          aria-label="Toggle navigation"
          @click="toggleNavbarToggler()"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarToggler">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item">
              <RouterLink
                class="nav-link"
                active-class="active"
                to="/"
                @click="toggleNavbarToggler()"
                >Home</RouterLink
              >
            </li>
            <li class="nav-item">
              <RouterLink
                class="nav-link"
                active-class="active"
                to="/hello-world"
                @click="toggleNavbarToggler()"
                >Hello, World!</RouterLink
              >
            </li>
          </ul>
        </div>
      </nav>
    </header>
    <div class="flex-shrink-0">
      <div class="container">
        <RouterView />
      </div>
    </div>
  </main>
</template>

<style scoped>
.container {
  padding: 60px 15px 0;
}
</style>
