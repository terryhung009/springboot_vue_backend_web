<template>
  <div style="padding: 10px">
    <el-table
        :data="tableData"
        style="width: 100%"
        stripe
        :row-class-name="tableRowClassName"
    >
      <el-table-column
          prop="date"
          label="Date"
          sortable
      />
      <el-table-column
          prop="name"
          label="Name"
          sortable  />
      <el-table-column
          prop="address"
          label="Address"
          sortable />
    </el-table>

  </div>
</template>

<script>
// @ is an alias to /src


export default {
  name: 'HomeView',
  components: {

  },
  data(){
    return{
      tableDate : [
        {
          date: '2016-05-03',
          name: 'Tom',
          address: 'No. 189, Grove St, Los Angeles',
        },
        {
          date: '2016-05-02',
          name: 'Tom',
          address: 'No. 189, Grove St, Los Angeles',
        },
        {
          date: '2016-05-04',
          name: 'Tom',
          address: 'No. 189, Grove St, Los Angeles',
        },
        {
          date: '2016-05-01',
          name: 'Tom',
          address: 'No. 189, Grove St, Los Angeles',
        },
      ]

    }
  }
}
</script>
