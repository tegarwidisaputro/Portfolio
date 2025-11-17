var fullName=[
    "Abdul Wasi\' al-Afif",
    "Tegar Widi Saputro",
    "Moch. Firman Hidayat",
    "Ellayuni Nur Fadila"
];
var emailArray=[
    "wasi@gmail.com",
    "tegar@gmail.com",
    "firman@gmail.com",
    "ella@gmail.com"
];
var passwordArray=[
    20081010165,
    20081010008,
    20081010002,
    20081010016
];

function register(){
    event.preventDefault();

    var fullname = document.getElementById("fullname-register").value;
    var email = document.getElementById("email-register").value;
    var password = document.getElementById("pass-register").value;
    var passwordRetype = document.getElementById("re-pass-register").value;
    
    if (fullname == ""){
        alert("Full Name required.");
        return ;
    }
    else if (email == ""){
        alert("Email required.");
        return ;
    }
    else if (password == ""){
        alert("Password required.");
        return ;
    }
    else if (passwordRetype == ""){
        alert("Password required.");
        return ;
    }
    else if ( password != passwordRetype ){
        alert("Password don't match retype your Password.");
        return;
    }
    else if(emailArray.indexOf(email) == -1){
        localStorage.setItem("fullname-register", fullname);
        localStorage.setItem("email-register", email);
        localStorage.setItem("pass-register", password);

        alert(email + "  Thanks for registration. \nTry to login Now");

        document.getElementById("fullname-register").value ="";
        document.getElementById("email-register").value ="";
        document.getElementById("pass-register").value="";
        document.getElementById("re-pass-register").value="";
        
        return window.location.href="./login.html";
    }
    else{
        alert(email + " is already register.");
        return ;
    }
}
function login(){
    event.preventDefault();

    var email = document.getElementById("email-login").value;
    var password = document.getElementById("pass-login").value;

    // var storedFullName = localStorage.getItem('fullname-register');
    var storedEmail = localStorage.getItem("email-register");
    var storedPassword = localStorage.getItem("pass-register");

    if (email == storedEmail && password == storedPassword) {
        alert("You are logged in  Now! \n Welcome to our website.");

        return window.location.href="../dashboard/main.html";
    } else {
        alert("Username and Password do not match!");
    }
}
function forgot(){
    event.preventDefault();

    var email = document.getElementById("email-forgot").value;

    if(emailArray.indexOf(email) == -1){
        if (email == ""){
            alert("Email required.");
            return ;
        }
        alert("Email does not exist.");
        return ;
    }

    alert("email is send to your email check it in 24hr. \n Thanks");

    document.getElementById("email-forgot").value ="";
    return window.location.href="./login.html";
}

function saveData() {
    document.cookie="fullname="+document.getElementById('fullname-register').value+"; expires=Thu, 18 Dec 2022 12:00:00 UTC";
    document.cookie="email="+document.getElementById('email-register').value+"; expires=Thu, 18 Dec 2022 12:00:00 UTC";
    document.cookie="password="+document.getElementById('pass-register').value+"; expires=Thu, 18 Dec 2019 12:00:00 UTC";
}