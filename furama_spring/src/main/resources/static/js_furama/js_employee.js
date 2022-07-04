$(document).ready(function () {
  $('#btnAddNew').click(function (event) {
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
                    document.getElementById("name").value = "";
                    document.getElementById("birth").value = "";
                    document.getElementById("idCard").value = "";
                    document.getElementById("phone").value = "";
                    document.getElementById("email").value = "";
                    document.getElementById("address").value = "";
                    document.getElementById("salary").value = "";
                    document.getElementById("username").value = "";
                    document.getElementById("password").value = "";
                    document.getElementById("bodyMessModal").innerHTML = "Thêm mới thành công";
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
    event.preventDefault();
  })
})

function getInfo(id, name, birth, idCard, salary, phone, email, address, position, degree, division, user) {
    document.getElementById("idEdit").value = id;
    document.getElementById("nameEdit").value = name;
    document.getElementById("birthEdit").value = birth;
    document.getElementById("idCardEdit").value = idCard;
    document.getElementById("salaryEdit").value = salary;
    document.getElementById("phoneEdit").value = phone;
    document.getElementById("emailEdit").value = email;
    document.getElementById("addressEdit").value = address;
    document.getElementById("positionEdit").value = position;
    document.getElementById("educationDegreeEdit").value = degree;
    document.getElementById("divisionEdit").value = division;
    document.getElementById("usernameEdit").value = user;
}

$(document).ready(function () {
    $('#btnEdit').click(function (event) {
        let id = document.getElementById("idEdit").value;
        let name = document.getElementById("nameEdit").value;
        let birth = document.getElementById("birthEdit").value;
        let idCard = document.getElementById("idCardEdit").value;
        let phone = document.getElementById("phoneEdit").value;
        let email = document.getElementById("emailEdit").value;
        let address = document.getElementById("addressEdit").value;
        let salary = document.getElementById("salaryEdit").value;
        let position = document.getElementById("positionEdit").value;
        let degree = document.getElementById("educationDegreeEdit").value;
        let division = document.getElementById("divisionEdit").value;
        let user = document.getElementById("usernameEdit").value;
        let jsonEmployeeEdit = {
            employeeId: id,
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
            url: '/employees/edit',
            data: JSON.stringify(jsonEmployeeEdit),
            contentType: 'application/json',
            success: function (data) {
                $('#editModal').modal('hide');
                document.getElementById("bodyMessModal").innerHTML = "Chỉnh sửa thành công";
                $('#messModal').modal('show');
            }
        })
        event.preventDefault();
    })
})