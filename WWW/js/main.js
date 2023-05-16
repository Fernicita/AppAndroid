//Se ejecuta del lado del cliente


let linkShow = document.getElementById("show")
let linkHide = document.getElementById("hide")


function showPassword(){
    let password = document.getElementById("password")
    password.type = "text"

}

function hidePassword(){
    document.getElementById("password").type = "password"

}
linkShow.onclick = showPassword
linkHide.onclick = hidePassword