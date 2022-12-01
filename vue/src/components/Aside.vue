<template>
  <div>
    <el-menu
        style="width: 200px; height: calc( 100vh - 50px );"
        default-active="2"
        class="el-menu-vertical-demo"

    >
      <el-sub-menu index="1">
        <template #title>
          <el-icon><location />
          </el-icon><span>選項一</span>
        </template>
        <el-menu-item index="1-1">
          <el-icon><icon-menu /></el-icon>
          <span>選項1-1</span>
        </el-menu-item>
      </el-sub-menu>
      <el-menu-item index="2">
        <el-icon><icon-menu /></el-icon>
        <span>選項2</span>
      </el-menu-item>
      <el-menu-item index="3">
        <el-icon><document /></el-icon>
        <span>選項3</span>
      </el-menu-item>

    </el-menu>
  </div>
</template>

<script>
export default {
  name: "Aside"
}
</script>

<style scoped>

</style>