// 改成变量了，问的gpt，获取当前视窗高度
const height = ref(window.innerHeight - 64 * 2);
const headerStyle = {
    textAlign: 'center',
    color: '#fff',
    height: 64,
    paddingInline: 50,
    lineHeight: '64px',
    backgroundColor: '#7dbcea',
};
const contentStyle = {
    textAlign: 'center',
    minHeight: '120px',
    lineHeight: '120px',
    color: '#fff',
    // 这里设置的就是视窗的高度
    height: height + "px",
    backgroundColor: '#108ee9',
};
const siderStyle = {
    textAlign: 'center',
    lineHeight: '120px',
    color: '#fff',
    backgroundColor: '#3ba0e9',
};
const footerStyle = {
    textAlign: 'center',
    color: '#fff',
    backgroundColor: '#7dbcea',
};