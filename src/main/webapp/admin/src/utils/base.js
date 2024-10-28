const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm0oip9/",
            name: "ssm0oip9",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm0oip9/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "药品管理系统"
        } 
    }
}
export default base
