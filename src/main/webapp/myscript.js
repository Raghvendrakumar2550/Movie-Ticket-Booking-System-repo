function validateForm() {
    var name = document.forms["regForm"]["name"].value;
    var address = document.forms["regForm"]["address"].value;
    var email = document.forms["regForm"]["email"].value;
    var mobile = document.forms["regForm"]["mobile"].value;
    var password = document.forms["regForm"]["password"].value;
    var confirmPassword = document.forms["regForm"]["confirmPassword"].value;

    var isValid = true;

    if (name == "") {
        document.getElementById("name-error").innerHTML = "Name is required";
        isValid = false;
    } else {
        document.getElementById("name-error").innerHTML = "";
    }

    if (address == "") {
        document.getElementById("address-error").innerHTML = "Address is required";
        isValid = false;
    } else {
        document.getElementById("address-error").innerHTML = "";
    }

    if (email == "") {
        document.getElementById("email-error").innerHTML = "Email is required";
        isValid = false;
    } else {
        document.getElementById("email-error").innerHTML = "";
    }

    if (mobile == "") {
        document.getElementById("mobile-error").innerHTML = "Mobile is required";
        isValid = false;
    } else {
        document.getElementById("mobile-error").innerHTML = "";
    }

    if (password == "") {
        document.getElementById("password-error").innerHTML = "Password is required";
        isValid = false;
    } else {
        document.getElementById("password-error").innerHTML = "";
    }

    if (confirmPassword == "") {
        document.getElementById("confirmPassword-error").innerHTML = "Confirm password is required";
        isValid = false;
    } else if (password !== confirmPassword) {
        document.getElementById("confirmPassword-error").innerHTML = "Passwords do not match";
        isValid = false;
    } else {
        document.getElementById("confirmPassword-error").innerHTML = "";
    }

    return isValid;
}
