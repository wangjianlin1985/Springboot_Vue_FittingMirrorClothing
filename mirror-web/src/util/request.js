import Vue from 'vue'
import axios from 'axios'

import {message} from 'ant-design-vue';
import baseURL from '@/util/baseURL'

Vue.prototype.$message = message;
const service = axios.create({
  baseURL: baseURL.baseurl,
  timeout: 90000
})

export default service
