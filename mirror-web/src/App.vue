<template>
<a-config-provider :locale="zh_CN"> 
  <div id="app">
    <router-view/>
  </div>
  </a-config-provider>
</template>

<script>
import zh_CN from "ant-design-vue/lib/locale-provider/zh_CN";
import moment from "moment";
import "moment/locale/zh-cn";
moment.locale("zh-cn");

export default {
  data() {
    return {
      zh_CN
    };
  }
}
</script>

<style lang="less">
#app {
  width: 100%;
  height: 100%;
}
</style>
