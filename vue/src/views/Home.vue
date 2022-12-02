<template>
  <div style="padding: 10px">
<!--    功能區域-->
    <div style="margin: 10px 0">
      <el-button type="primary" @click="add">新增</el-button>
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
          prop="id"
          label="ID"
          sortable
      />
      <el-table-column
          prop="username"
          label="帳號"
          sortable  />
      <el-table-column
          prop="address"
          label="地址"
          sortable />
      <el-table-column
          prop="nickName"
          label="暱稱"
          sortable />
      <el-table-column
          prop="age"
          label="年齡"
          sortable />
      <el-table-column
        prop="sex"
        label="性別"
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
      <el-dialog
          v-model="dialogVisible"
          title="確認"
          width="30%"

      >
        <el-form :model="form" label-width="120px">
          <el-form-item label="帳號" prop="username">
            <el-input v-model="form.username" style="width:  80%;"/>
          </el-form-item>
          <el-form-item label="暱稱" prop="nickname">
            <el-input v-model="form.nickName" style="width:  80%;"/>
          </el-form-item>
          <el-form-item label="年齡" prop="age">
            <el-input v-model="form.age" style="width:  80%;"/>
          </el-form-item>
          <el-form-item label="性別" prop="sex">
            <el-radio-group v-model="form.sex" class="ml-4">
              <el-radio  label="男" size="large">男</el-radio>
              <el-radio  label="女" size="large">女</el-radio>
            </el-radio-group>

          </el-form-item>
          <el-form-item label="地址" prop="address">
            <el-input type="textarea" v-model="form.address" style="width:  80%;"/>
          </el-form-item>

        </el-form>
        <template #footer>
      <span class="dialog-footer">
        <el-button @click="dialogVisible = false">取消</el-button>
        <el-button type="primary" @click="save">
          確定
        </el-button>
      </span>
        </template>
      </el-dialog>
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
      form: {},
      search: "",
      currentPage:1,
      total: 10 ,
      tableDate: [],
      dialogVisible:false,

    }


    },
  methods:{
    add(){
      this.dialogVisible = true;
      this.form = {}
    },
    handleEdit(){

    },
    handleCurrentChange(){

    },
    handleSizeChange(){

    },
    save(){


      this.dialogVisible = false
    }

  }


}
</script>
