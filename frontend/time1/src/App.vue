<script>
import "bootstrap/dist/css/bootstrap.min.css";

export default {};
</script>

<template>
  <main>
    <header class="d-flex flex-column h-100">
      <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <div class="container-fluid">
          <div class="collapse navbar-collapse">
            <ul class="navbar-nav me-auto mb-2 mb-md-0">
              <li class="nav-item">
                <RouterLink class="nav-link" active-class="active" to="/"
                  >Home</RouterLink
                >
              </li>
              <li class="nav-item">
                <RouterLink
                  class="nav-link"
                  active-class="active"
                  to="/hello-world"
                  >Hello, World!</RouterLink
                >
              </li>
            </ul>
          </div>
        </div>
      </nav>
    </header>
    <div class="flex-shrink-0">
      <div class="container"><RouterView /></div>
    </div>
  </main>
</template>

<style scoped>
.container {
  padding: 60px 15px 0;
}
</style>
