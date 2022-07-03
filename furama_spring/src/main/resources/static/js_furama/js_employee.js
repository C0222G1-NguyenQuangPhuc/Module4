$(document).ready(function () {
  $('#btnAddNew').click(function () {
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;
    let jsonUser = {
        userName: username,
        password: password
    }
    $.ajax({
        type: 'POST',
        url: '/employees/save/user',
        data: JSON.stringify(jsonUser),
        contentType: 'application/json',
        success: function (data) {
            let name = document.getElementById("name").value;
            let birth = document.getElementById("birth").value;
            let idCard = document.getElementById("idCard").value;
            let phone = document.getElementById("phone").value;
            let email = document.getElementById("email").value;
            let address = document.getElementById("address").value;
            let salary = document.getElementById("salary").value;
            let position = document.getElementById("position").value;
            let degree = document.getElementById("educationDegree").value;
            let division = document.getElementById("division").value;
            let user = document.getElementById("username").value;
            let jsonEmployee = {
                employeeName: name,
                employeeBirthDay: birth,
                employeeIdCard: idCard,
                employeeSalary: salary,
                employeePhone: phone,
                employeeEmail: email,
                employeeAddress: address,
                position: {
                    positionId : position
                },
                educationDegree: {
                    educationDegreeId: degree
                },
                division:{
                    divisionId: division
                },
                user:{
                    userName: user
                }
            }
            $.ajax({
                type: 'POST',
                url: '/employees/save/employee',
                data: JSON.stringify(jsonEmployee),
                contentType: 'application/json',
                success: function () {
                    $('#addModal').modal('hide');
                    document.getElementById("bodyMessModal").innerHTML = "thành công";
                    $('#messModal').modal('show');

                },error: function () {
                    $('#addModal').modal('hide');
                    document.getElementById("bodyMessModal").innerHTML = "tạo nhân viên ko thành công";
                    $('#messModal').modal('show');
                }
            })
        },
        error: function (data) {
            $('#addModal').modal('hide');
            document.getElementById("bodyMessModal").innerHTML = "tạo tài khoản ko thành công";
            $('#messModal').modal('show');
        }
    })
  })
})