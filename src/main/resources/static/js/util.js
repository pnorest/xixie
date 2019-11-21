$(function () {
    $('#loginOut').click(function(){
        logout();
    });
})
function logout() {
    $.ajax({
        type:'POST',
        url:'/logout',
        dataType:'text',
        success:function(data){
            window.location.reload()
        }
    })
}
