<template>
  <div style="padding: 10px">
<!--    功能區域-->
    <div style="margin: 10px 0">
      <el-button type="primary">新增</el-button>
      <el-button type="primary">導入</el-button>
      <el-button type="primary">導出</el-button>
    </div>
<!--    搜索區域-->
    <div style="margin: 10px">
      <el-input v-model="search" placeholder="請輸入關鍵字" style="width: 30%"/>
      <el-button type="primary" style="margin-left: 10px">搜尋</el-button>

    </div>
<!--    資料區域-->
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

      <el-table-column fixed="right" label="Operations" width="120">
        <template #default>
          <el-button link type="primary"  @click="handleEdit"
          >編輯</el-button>
          <el-popconfirm title="確認刪除嗎?">
            <template #reference>
              <el-button link type="primary" >刪除</el-button>
            </template>
          </el-popconfirm>

        </template>
      </el-table-column>
    </el-table>
<!--    分頁區-->
    <div style="margin: 10px 0">
      <el-pagination
          v-model:current-page="currentPage"
          v-model:page-size="pageSize"
          :page-sizes="[5, 10, 20]"
          :small="small"
          :disabled="disabled"
          :background="background"
          layout="total, sizes, prev, pager, next, jumper"
          :total="total"
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
      />
    </div>

  </div>
</template>

<script>
// @ is an alias to /src


export default {
  name: 'HomeView',
  components: {

  },
  data(){
    return {
      search: "",
      currentPage:1,
      total: 10 ,
      tableDate: [
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


    },
  methods:{
    handleEdit(){

    },
    handleCurrentChange(){

    },
    handleSizeChange(){

    }

  }


}
</script>
