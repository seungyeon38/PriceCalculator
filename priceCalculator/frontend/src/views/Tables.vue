<template>
  <div class="py-4 container-fluid">
    <div class="row align-items-center">
        <div class="col-lg-4 col-sm-8">
            <nav-pill />
        </div>
    </div>
    <div class="row">
      <div class="col-12">
        <ingredients-table />
      </div>
    </div>
    <div class="row">
      <div class="col-12">
        <projects-table />
      </div>
    </div>
  </div>
</template>

<script>
import IngredientsTable from "./components/IngredientsTable.vue";
import ProjectsTable from "./components/ProjectsTable";
import NavPill from "@/views/components/NavPill.vue";

export default {
  name: "tables",
  components: {
      NavPill,
    IngredientsTable,
    ProjectsTable,
  },
};
</script>
