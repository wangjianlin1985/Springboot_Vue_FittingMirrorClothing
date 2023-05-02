import Vue from 'vue'
import App from './App'
import './assets/css/Public.css'
import router from './router'


import * as echarts from 'echarts';
Vue.prototype.$echarts = echarts


import {Button, message, Spin, Icon, Row, Col, FormModel, Input,
PageHeader,
Layout,
Menu,
Card,
Select,
Table,
Modal,
LocaleProvider,
ConfigProvider,
DatePicker,
InputNumber,
notification,
Upload} from 'ant-design-vue';


Vue.use(Button);
Vue.use(Spin);
Vue.use(Icon);
Vue.use(Row);
Vue.use(Col);
Vue.use(FormModel);
Vue.use(Input);
Vue.use(PageHeader);
Vue.use(Layout);
Vue.use(Menu);
Vue.use(Card);
Vue.use(Select);
Vue.use(Table);
Vue.use(Modal);
Vue.use(LocaleProvider);
Vue.use(ConfigProvider);
Vue.use(DatePicker);
Vue.use(InputNumber);
Vue.use(Upload);

Vue.prototype.$message = message;
Vue.prototype.$notification = notification;
Vue.prototype.$confirm = Modal.confirm;
Vue.prototype.$info = Modal.info;

Vue.config.productionTip = false
new Vue({
  router,
  render: h => h(App)
}).$mount("#app");