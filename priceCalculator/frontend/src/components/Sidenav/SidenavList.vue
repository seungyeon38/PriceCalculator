<template>
  <div class="w-auto h-auto collapse navbar-collapse max-height-vh-100 h-100"
       id="sidenav-collapse-main">
    <ul class="navbar-nav">
        <li class="nav-item">
            <sidenav-collapse navText="Tables" :to="{ name: 'Tables' }">
                <template #icon>
                    <office />
                </template>
            </sidenav-collapse>
        </li>
    </ul>
  </div>
</template>
<script>
import SidenavCollapse from "./SidenavCollapse.vue";
import Office from "../../assets/icons/Office.vue";

export default {
    name: "SidenavList",
    components: {
        SidenavCollapse,
        Office
    },
    // data() {
    //     return {
    //         title: "Soft UI Dashboard PRO",
    //         controls: "dashboardsExamples",
    //         isActive: "active",
    //     };
    // },
}

</script>