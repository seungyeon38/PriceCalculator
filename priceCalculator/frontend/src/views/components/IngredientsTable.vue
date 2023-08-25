<template>
  <div class="card mb-4">
    <div class="card-header pb-0">
      <h5>재료</h5>
    </div>
    <div class="card-body px-0 pt-0 pb-2">
      <div class="table-responsive p-0">
        <table class="table align-items-center mb-0">
          <thead>
            <tr>
                <th class="text-secondary text-s font-weight-bolder">
                    재료명
                </th>
                <th class="text-secondary text-s font-weight-bolder">
                    카테고리
                </th>
                <th class="text-secondary text-s font-weight-bolder">
                    구매처
                </th>
                <th class="text-secondary text-s font-weight-bolder">
                    단위당 가격
                </th>
                <th class="text-secondary text-s font-weight-bolder">
                    용량
                </th>
                <th class="text-secondary text-s font-weight-bolder">
                    가격
                </th>
            </tr>
          </thead>
          <tbody>
            <tr>
                <td class="align-middle text-center">
                    <div class="text-sm">
                        우유
                    </div>
                </td>
                <td class="text-center">
                    <div class="text-sm">
                        음료
                    </div>
                </td>
                <td class="text-center">
                    <div class="text-sm">
                        기타
                    </div>
                </td>
                <td class="text-center">
                    <div class="text-sm">
                        100원 (g 당)
                    </div>
                </td>
                <td class="text-center">
                    <div class="text-sm">
                        1000ml
                    </div>
                </td>
                <td class="text-center">
                    <div class="text-sm">
                        2200원
                    </div>
                </td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</template>

<script>
import SoftAvatar from "@/components/SoftAvatar.vue";
import SoftBadge from "@/components/SoftBadge.vue";

export default {
  name: "ingredients-table",
  data() {
      return {
          items: [
              { age: 40, first_name: 'Dickerson', last_name: 'Macdonald' },
              { age: 21, first_name: 'Larsen', last_name: 'Shaw' },
              { age: 89, first_name: 'Geneva', last_name: 'Wilson' },
              { age: 38, first_name: 'Jami', last_name: 'Carney' }
          ]
      }
  }
};
</script>
