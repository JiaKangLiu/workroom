webpackJsonp([1],{AlXo:function(e,t){},IKNQ:function(e,t){},NHnr:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var l=r("7+uW"),a={render:function(){var e=this.$createElement,t=this._self._c||e;return t("div",{attrs:{id:"app"}},[t("router-view")],1)},staticRenderFns:[]};var o=r("VU/8")({name:"App"},a,!1,function(e){r("wYGR")},null,null).exports,s=r("/ocq"),i={render:function(){var e=this.$createElement,t=this._self._c||e;return t("div",{attrs:{id:"header"}},[t("el-row",{attrs:{type:"flex",justify:"space-between"}},[t("el-col",{attrs:{span:10,id:"header-left"}},[t("img",{staticClass:"icon",attrs:{src:r("yWqi")}}),this._v(" "),t("span",{staticClass:"title"},[this._v("新媒体工作室")])]),this._v(" "),t("el-col",{attrs:{span:4,id:"header-center"}},[t("span",{staticClass:"title"},[this._v("信息收集表")])]),this._v(" "),t("el-col",{attrs:{span:10,id:"header-right"}},[t("span",{staticClass:"title"},[this._v("欢迎各位新老工作室的成员！")])])],1)],1)},staticRenderFns:[]};var n={name:"Form",data:function(){return{ruleForm:{name:"",sex:"",number:"",province:"",address:"",date:"",academy:"",major:"",classes:"",phone:"",qq:"",section:"",duty:"",timeString:""},fileName:"",imageUrl:"",dialogVisible:!1,dialogImageUrl:"",allProvinces:[],allSections:[],allDuties:[],timeColumn:[{timeSlot:"7:30~9:30",rowNumber:1},{timeSlot:"9:30~12:30",rowNumber:2},{timeSlot:"13:50~15:30",rowNumber:3},{timeSlot:"15:30~18:30",rowNumber:4},{timeSlot:"18:30~21:30",rowNumber:5}],timeTableHeader:[{label:"星期一"},{label:"星期二"},{label:"星期三"},{label:"星期四"},{label:"星期五"},{label:"星期六"},{label:"星期七"}],timeStatus:[[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0]],timeArray:[],rules:{name:[{required:!0,message:"请填写名字！",trigger:"blur"}],number:[{required:!0,message:"请填写学号！",trigger:"blur"},{len:10,message:"请填写正确的学号！",trigger:"blur"}],sex:[{required:!0,message:"请选择性别！",trigger:"change"}],address:[{required:!0,message:"请填写地址！",trigger:"blur"}],date:[{required:!0,message:"请选择出生日期！",trigger:"blur"}],academy:[{required:!0,message:"请填写学院名！",trigger:"blur"}],major:[{required:!0,message:"请填写专业！",trigger:"blur"}],classes:[{required:!0,message:"请填写班级！",trigger:"blur"}],phone:[{required:!0,message:"请填写手机号！",trigger:"blur"},{pattern:/^1[3|4|5|7|8][0-9]{9}$/,message:"请填写正确的格式！",trigger:"blur"}],qq:[{required:!0,message:"请填写QQ号！",trigger:"blur"},{pattern:/^[1-9][0-9]{4,10}$/,message:"请填写正确的格式！",trigger:"blur"}],section:[{required:!0,message:"请选择部门！",trigger:"change"}],duty:[{required:!0,message:"请选择职务！",trigger:"change"}],timeString:[{required:!0,message:"请填写空余时间表！"}]}}},methods:{imgChange:function(e,t){this.fileName=e.name.slice(0,e.name.indexOf(".")),this.imageUrl=e.url},handlePreview:function(e){console.log("图片完全显示！"),this.dialogImageUrl=e.url,this.dialogVisible=!0},beforeRemove:function(e,t){return this.$confirm("确定移除"+e.name+"？","提示")},handleRemove:function(e,t){console.log("图片已删除！")},handleExceed:function(e,t){this.$message({message:"只能选一张！",type:"warning",showClose:!0})},submitForm:function(e){var t=this;if(""===this.ruleForm.province)return this.$message({message:"您的籍贯省份未选择，无法提交！",type:"error",showClose:!0}),console.log("籍贯省份未选择！");this.ruleForm.timeString=this.codeConnect,this.$refs[e].validate(function(e){if(e){if(console.log("it can submit"),!t.fileNameTrue)return t.$message({message:"您的图片名不符合要求，请删掉重传！",type:"error",showClose:!0}),console.log("命名错误的图片！");if(""===t.imageUrl)return t.$message({message:"您还未上传图片！",type:"error",showClose:!0}),console.log("未上传图片！");t.$refs.upload.submit(),console.log("图片上传"),t.ruleForm.academy+="学院",t.ruleForm.classes+="班",t.$axios.post("AddStudentMessage",{name:t.ruleForm.name,sex:t.ruleForm.sex,number:t.ruleForm.number,province:t.ruleForm.province,address:t.ruleForm.address,date:t.ruleForm.date,academy:t.ruleForm.academy,major:t.ruleForm.major,classes:t.ruleForm.classes,phone:t.ruleForm.phone,qq:t.ruleForm.qq,section:t.ruleForm.section,duty:t.ruleForm.duty,timeString:t.ruleForm.timeString}).then(function(e){console.log(e),t.$alert("点击确认刷新页面。","提交成功",{confirmButtonText:"确定",callback:function(e){history.go(0)}})}).catch(function(e){console.log(e),t.$message({message:"提交失败！",type:"error",showClose:!0})})}else console.log("it have error")})},resetForm:function(e){var t=this;this.$confirm("此操作将把除空余时间表的其它表单重置，是否继续？","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){t.imageUrl="",t.$refs[e].resetFields(),t.$refs.upload.clearFiles(),console.log("reset complete"),t.$message({message:"已成功重置！",type:"success"})}).catch(function(){console.log("reset cancel"),t.$message({message:"已取消重置。"})})},handleCellClick:function(e,t,r,l){var a=(t.id.slice(18)-1)%8-1;if(a<0)return console.log("此列不能点哦！");var o=e.rowNumber-1,s=String(a+1)+(o+1);if(0===this.timeStatus[a][o])r.style.backgroundColor="#409EFF",this.timeStatus[a][o]=1,this.timeArray.push(s);else{r.style.backgroundColor="white",this.timeStatus[a][o]=0;for(var i=0;i<this.timeArray.length;i++)this.timeArray[i]===s&&this.timeArray.splice(i,1)}},getInfo:function(){var e=this;this.$axios.post("GetJson").then(function(t){(t=t.data).ret&&t.data&&(e.allProvinces=t.data.allProvinces,e.allSections=t.data.allSections,e.allDuties=t.data.allDuties),console.log("the request success")}).catch(function(t){console.log("the request error"),e.$message({message:"列表数据请求失败，请刷新页面！",type:"error",showClose:!0})})}},mounted:function(){this.getInfo()},computed:{codeConnect:function(){for(var e="",t=0;t<this.timeArray.length;t++)e+=this.timeArray[t];return e},fileNameTrue:function(){return this.fileName===this.ruleForm.name}}},u={render:function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",{attrs:{id:"form"}},[r("el-form",{ref:"ruleForm",attrs:{model:e.ruleForm,rules:e.rules,"label-width":"100px"}},[r("el-row",{attrs:{id:"firstRow"}},[r("el-col",{attrs:{span:24}},[r("el-form-item",{attrs:{label:"照片上传"}},[r("el-upload",{ref:"upload",attrs:{action:"UpLoad","list-type":"picture-card","auto-upload":!1,limit:1,"on-change":e.imgChange,"on-preview":e.handlePreview,"before-remove":e.beforeRemove,"on-remove":e.handleRemove,"on-exceed":e.handleExceed}},[r("i",{staticClass:"el-icon-plus"})]),e._v(" "),r("div",{staticStyle:{color:"#F56C6C"}},[e._v("注：请将图片名命名为您的名字再上传！")]),e._v(" "),r("el-dialog",{attrs:{visible:e.dialogVisible},on:{"update:visible":function(t){e.dialogVisible=t}}},[r("img",{attrs:{width:"100%",src:e.dialogImageUrl,alt:""}})])],1)],1)],1),e._v(" "),r("el-row",{attrs:{id:"secondRow"}},[r("el-col",{attrs:{span:8}},[r("el-form-item",{attrs:{label:"姓名",prop:"name"}},[r("el-input",{attrs:{placeholder:"请输入您的姓名"},model:{value:e.ruleForm.name,callback:function(t){e.$set(e.ruleForm,"name",t)},expression:"ruleForm.name"}})],1)],1),e._v(" "),r("el-col",{attrs:{span:8}},[r("el-form-item",{attrs:{label:"学号",prop:"number"}},[r("el-input",{attrs:{placeholder:"请输入您的学号"},model:{value:e.ruleForm.number,callback:function(t){e.$set(e.ruleForm,"number",t)},expression:"ruleForm.number"}})],1)],1),e._v(" "),r("el-col",{staticClass:"thirdCol",attrs:{span:8}},[r("el-form-item",{attrs:{label:"性别",prop:"sex"}},[r("el-radio-group",{model:{value:e.ruleForm.sex,callback:function(t){e.$set(e.ruleForm,"sex",t)},expression:"ruleForm.sex"}},[r("el-radio",{attrs:{label:"男"}},[e._v("男")]),e._v(" "),r("el-radio",{attrs:{label:"女"}},[e._v("女")])],1)],1)],1)],1),e._v(" "),r("el-row",{attrs:{id:"thirdRow"}},[r("el-col",{staticClass:"firstCol",attrs:{span:16}},[r("el-form-item",{attrs:{label:"籍贯",prop:"address"}},[r("el-input",{attrs:{placeholder:"请输入具体地址"},model:{value:e.ruleForm.address,callback:function(t){e.$set(e.ruleForm,"address",t)},expression:"ruleForm.address"}},[r("el-select",{attrs:{slot:"prepend",placeholder:"请选择省份，可搜索",filterable:"",clearable:""},slot:"prepend",model:{value:e.ruleForm.province,callback:function(t){e.$set(e.ruleForm,"province",t)},expression:"ruleForm.province"}},e._l(e.allProvinces,function(e){return r("el-option",{key:e.value,attrs:{label:e.label,value:e.value}})}))],1)],1)],1),e._v(" "),r("el-col",{staticClass:"secondCol",attrs:{span:8}},[r("el-form-item",{attrs:{label:"出生日期",prop:"date"}},[r("el-date-picker",{attrs:{type:"date",placeholder:"请选择出生日期"},model:{value:e.ruleForm.date,callback:function(t){e.$set(e.ruleForm,"date",t)},expression:"ruleForm.date"}})],1)],1)],1),e._v(" "),r("el-row",{attrs:{id:"fourthRow"}},[r("el-col",{attrs:{span:8}},[r("el-form-item",{attrs:{label:"学院",prop:"academy"}},[r("el-input",{attrs:{placeholder:"请输入学院名"},model:{value:e.ruleForm.academy,callback:function(t){e.$set(e.ruleForm,"academy",t)},expression:"ruleForm.academy"}},[r("template",{slot:"append"},[e._v("学院")])],2)],1)],1),e._v(" "),r("el-col",{attrs:{span:8}},[r("el-form-item",{attrs:{label:"专业",prop:"major"}},[r("el-input",{attrs:{placeholder:"请输入专业"},model:{value:e.ruleForm.major,callback:function(t){e.$set(e.ruleForm,"major",t)},expression:"ruleForm.major"}})],1)],1),e._v(" "),r("el-col",{attrs:{span:8}},[r("el-form-item",{attrs:{label:"班级",prop:"classes"}},[r("el-input",{attrs:{placeholder:"请输入班级"},model:{value:e.ruleForm.classes,callback:function(t){e.$set(e.ruleForm,"classes",t)},expression:"ruleForm.classes"}},[r("template",{slot:"append"},[e._v("班")])],2)],1)],1)],1),e._v(" "),r("el-row",{attrs:{id:"fifthRow"}},[r("el-col",{attrs:{span:8}},[r("el-form-item",{attrs:{label:"联系电话",prop:"phone"}},[r("el-input",{attrs:{placeholder:"请输入电话"},model:{value:e.ruleForm.phone,callback:function(t){e.$set(e.ruleForm,"phone",t)},expression:"ruleForm.phone"}})],1)],1),e._v(" "),r("el-col",{attrs:{span:8}},[r("el-form-item",{attrs:{label:"QQ",prop:"qq"}},[r("el-input",{attrs:{placeholder:"请输入QQ"},model:{value:e.ruleForm.qq,callback:function(t){e.$set(e.ruleForm,"qq",t)},expression:"ruleForm.qq"}})],1)],1)],1),e._v(" "),r("el-row",{attrs:{id:"sixthRow"}},[r("el-col",{attrs:{span:8}},[r("el-form-item",{attrs:{label:"所在部门",prop:"section"}},[r("el-select",{attrs:{placeholder:"请选择所在部门",filterable:"",clearable:""},model:{value:e.ruleForm.section,callback:function(t){e.$set(e.ruleForm,"section",t)},expression:"ruleForm.section"}},e._l(e.allSections,function(e){return r("el-option",{key:e.value,attrs:{label:e.label,value:e.value}})}))],1)],1),e._v(" "),r("el-col",{attrs:{span:8}},[r("el-form-item",{attrs:{label:"职务",prop:"duty"}},[r("el-select",{attrs:{placeholder:"请选择职务",filterable:"",clearable:""},model:{value:e.ruleForm.duty,callback:function(t){e.$set(e.ruleForm,"duty",t)},expression:"ruleForm.duty"}},e._l(e.allDuties,function(e){return r("el-option",{key:e.value,attrs:{label:e.label,value:e.value}})}))],1)],1)],1),e._v(" "),r("el-row",{attrs:{id:"seventhRow"}},[r("el-col",{attrs:{span:24}},[r("el-form-item",{attrs:{label:"空余时间表",prop:"timeString"}},[r("el-table",{staticStyle:{width:"850px"},attrs:{data:e.timeColumn,border:""},on:{"cell-click":e.handleCellClick}},[r("el-table-column",{attrs:{align:"center",label:"时间段",prop:"timeSlot",width:"150"}}),e._v(" "),e._l(e.timeTableHeader,function(e,t){return r("el-table-column",{key:t,attrs:{align:"center",width:"100",label:e.label}})})],2),e._v(" "),r("div",{staticStyle:{color:"#F56C6C"}},[e._v("注：此表是填空闲时间，与课表反着来，不要填成课表了！")])],1)],1)],1),e._v(" "),r("el-row",{attrs:{id:"eighthRow"}},[r("el-col",{staticClass:"firstCol",attrs:{span:24}},[r("el-button",{attrs:{type:"primary"},on:{click:function(t){e.submitForm("ruleForm")}}},[e._v("提交")]),e._v(" "),r("el-button",{on:{click:function(t){e.resetForm("ruleForm")}}},[e._v("重置")])],1)],1)],1)],1)},staticRenderFns:[]};var c={name:"CollectInfo",components:{TheHeader:r("VU/8")({name:"Header"},i,!1,function(e){r("IKNQ")},"data-v-3263ab6f",null).exports,TheForm:r("VU/8")(n,u,!1,function(e){r("AlXo")},"data-v-9b757f32",null).exports}},m={render:function(){var e=this.$createElement,t=this._self._c||e;return t("div",{attrs:{id:"collectInfo"}},[t("the-header"),this._v(" "),t("the-form")],1)},staticRenderFns:[]};var d=r("VU/8")(c,m,!1,function(e){r("SPtc")},"data-v-73ee7d81",null).exports;l.default.use(s.a);var p=new s.a({routes:[{path:"/",name:"CollectInfo",component:d}]}),f=r("mtWM"),g=r.n(f),h=r("zL8q"),v=r.n(h);r("tvR6"),r("cjdf"),r("m0iu");l.default.config.productionTip=!1,l.default.prototype.$axios=g.a,l.default.use(v.a),new l.default({el:"#app",router:p,components:{App:o},template:"<App/>"})},SPtc:function(e,t){},cjdf:function(e,t){},m0iu:function(e,t){},tvR6:function(e,t){},wYGR:function(e,t){},yWqi:function(e,t,r){e.exports=r.p+"static/img/studio.4da5f2b.jpg"}},["NHnr"]);
//# sourceMappingURL=app.b2a798c92c5d3790becb.js.map