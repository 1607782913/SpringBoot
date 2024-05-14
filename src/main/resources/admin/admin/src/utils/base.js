const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot7z6vr/",
            name: "springboot7z6vr",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot7z6vr/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "中小学家校通系统的设计与实现"
        } 
    }
}
export default base
