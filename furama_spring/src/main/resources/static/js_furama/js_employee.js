// Function Add New
$(document).ready(function () {
    $('#btnAddNew').click(function (event) {
        let username = document.getElementById("username").value;
        let password = document.getElementById("password").value;
        let jsonUser = {
            username: username,
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
                        positionId: position
                    },
                    educationDegree: {
                        educationDegreeId: degree
                    },
                    division: {
                        divisionId: division
                    },
                    user: {
                        username: user
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
                        document.getElementById("bodyMessModal").innerHTML = "Th??m m???i th??nh c??ng";
                        $('#messModal').modal('show');
                    }, error: function (event) {
                        console.log(event.responseJSON);
                        if (event.responseJSON.employeeName !== "" && event.responseJSON.employeeName !== undefined) {
                            document.getElementById("nameError").innerHTML = event.responseJSON.employeeName;
                        } else {
                            document.getElementById("nameError").innerHTML = "";
                        }
                        if (event.responseJSON.employeeBirthDay !== "" && event.responseJSON.employeeBirthDay !== undefined) {
                            document.getElementById("birthError").innerHTML = event.responseJSON.employeeBirthDay;
                        } else {
                            document.getElementById("birthError").innerHTML = "";
                        }
                        if (event.responseJSON.employeeIdCard !== "" && event.responseJSON.employeeIdCard !== undefined) {
                            document.getElementById("idCardError").innerHTML = event.responseJSON.employeeIdCard;
                        } else {
                            document.getElementById("idCardError").innerHTML = "";
                        }
                        if (event.responseJSON.employeePhone !== "" && event.responseJSON.employeePhone !== undefined) {
                            document.getElementById("phoneError").innerHTML = event.responseJSON.employeePhone;
                        } else {
                            document.getElementById("phoneError").innerHTML = "";
                        }
                        if (event.responseJSON.employeeEmail !== "" && event.responseJSON.employeeEmail !== undefined) {
                            document.getElementById("emailError").innerHTML = event.responseJSON.employeeEmail;
                        } else {
                            document.getElementById("emailError").innerHTML = "";
                        }
                        if (event.responseJSON.employeeAddress !== "" && event.responseJSON.employeeAddress !== undefined) {
                            document.getElementById("addressError").innerHTML = event.responseJSON.employeeAddress;
                        } else {
                            document.getElementById("addressError").innerHTML = "";
                        }
                        if (event.responseJSON.employeeSalary !== "" && event.responseJSON.employeeSalary !== undefined) {
                            document.getElementById("salaryError").innerHTML = event.responseJSON.employeeSalary;
                        } else {
                            document.getElementById("salaryError").innerHTML = "";
                        }
                    }
                })
            },
            error: function (data) {
                $('#addModal').modal('hide');
                document.getElementById("bodyMessModal").innerHTML = "T???o t??i kho???n ko th??nh c??ng";
                $('#messModal').modal('show');
            }
        })
        event.preventDefault();
    })
})

// Function get info edit
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

// function edit
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
                positionId: position
            },
            educationDegree: {
                educationDegreeId: degree
            },
            division: {
                divisionId: division
            },
            user: {
                username: user
            }
        }
        $.ajax({
            type: 'POST',
            url: '/employees/edit',
            data: JSON.stringify(jsonEmployeeEdit),
            contentType: 'application/json',
            success: function (data) {
                $('#editModal').modal('hide');
                document.getElementById("bodyMessModal").innerHTML = "Ch???nh s???a th??nh c??ng";
                $('#messModal').modal('show');
            },
            error: function (event) {
                console.log(event.responseJSON);
                if (event.responseJSON.employeeName !== "" && event.responseJSON.employeeName !== undefined) {
                    document.getElementById("nameEditError").innerHTML = event.responseJSON.employeeName;
                } else {
                    document.getElementById("nameEditError").innerHTML = "";
                }
                if (event.responseJSON.employeeBirthDay !== "" && event.responseJSON.employeeBirthDay !== undefined) {
                    document.getElementById("birthEditError").innerHTML = event.responseJSON.employeeBirthDay;
                } else {
                    document.getElementById("birthEditError").innerHTML = "";
                }
                if (event.responseJSON.employeeIdCard !== "" && event.responseJSON.employeeIdCard !== undefined) {
                    document.getElementById("idCardEditError").innerHTML = event.responseJSON.employeeIdCard;
                } else {
                    document.getElementById("idCardEditError").innerHTML = "";
                }
                if (event.responseJSON.employeePhone !== "" && event.responseJSON.employeePhone !== undefined) {
                    document.getElementById("phoneEditError").innerHTML = event.responseJSON.employeePhone;
                } else {
                    document.getElementById("phoneEditError").innerHTML = "";
                }
                if (event.responseJSON.employeeEmail !== "" && event.responseJSON.employeeEmail !== undefined) {
                    document.getElementById("emailEditError").innerHTML = event.responseJSON.employeeEmail;
                } else {
                    document.getElementById("emailEditError").innerHTML = "";
                }
                if (event.responseJSON.employeeAddress !== "" && event.responseJSON.employeeAddress !== undefined) {
                    document.getElementById("addressEditError").innerHTML = event.responseJSON.employeeAddress;
                } else {
                    document.getElementById("addressEditError").innerHTML = "";
                }
                if (event.responseJSON.employeeSalary !== "" && event.responseJSON.employeeSalary !== undefined) {
                    document.getElementById("salaryEditError").innerHTML = event.responseJSON.employeeSalary;
                } else {
                    document.getElementById("salaryEditError").innerHTML = "";
                }
            }
        })
        event.preventDefault();
    })
})

// Function get info delete
function showInfo(id, name) {
    document.getElementById("confirm").innerHTML = "Ch???c ch???n x??a nh??n vi??n c?? t??n <br>" + name;
    document.getElementById("idDelete").value = id;
}

// Function delete
$(document).ready(function () {
    $('#btnComfirmDelete').click(function (event) {
        let id = document.getElementById("idDelete").value;
        $.ajax({
            type: 'GET',
            url: `/employees/delete/${id}`,
            success: function () {
                $('#deleteModal').modal('hide');
                document.getElementById("bodyMessModal").innerHTML = "X??a th??nh c??ng";
                $('#messModal').modal('show');
            },
            error: function () {
                $('#deleteModal').modal('hide');
                document.getElementById("bodyMessModal").innerHTML = "X??a kh??ng th??nh c??ng";
                $('#messModal').modal('show');
            }
        })
        event.preventDefault();
    })
})

// Function search
$(document).ready(function () {
    $('#btnSearch').click(function (event) {
        let txt = document.getElementById("keyword").value;
        $.ajax({
            type: "GET",
            url: `/employees/search/${txt}`,
            success: function (data) {
                console.log("Th??nh c??ng");
                console.log(data);
                let content = '';
                for (let i = 0; i < data.content.length; i++) {
                    content += getContent(data.content[i]);
                }
                document.getElementById('bodyTable').innerHTML = content;
            },
            error: function (event) {
                document.getElementById("bodyMessModal").innerHTML = "<h5 style='font-weight: bold;color: red'>Kh??ng t??m th???y</h5>";
                $('#messModal').modal('show');
            }
        });
        event.preventDefault();
    });
})

function getContent(item) {
    return `        <tr>
            <td>${item.employeeId}</td>
            <td>${item.employeeName}</td>
            <td>${item.employeeBirthDay}</td>
            <td>${item.employeeIdCard}</td>
            <td>${item.employeeSalary}</td>
            <td>${item.employeePhone}</td>
            <td>${item.employeeEmail}</td>
            <td>${item.employeeAddress}</td>
            <td>${item.position.positionName}</td>
            <td>${item.educationDegree.educationDegreeName}</td>
            <td>${item.division.divisionName}</td>
            <td class="d-flex">
                <div class="col-6">
                    <button type="button" class="btn btn-dark btn-outline-dark" data-toggle="modal"
                            data-target="#editModal"
                            onclick="getInfo('${item.employeeId}', '${item.employeeName}', '${item.employeeBirthDay}',
                                              '${item.employeeIdCard}', '${item.employeeSalary}', '${item.employeePhone}',
                                              '${item.employeeEmail}', '${item.employeeAddress}', '${item.position.positionId}',
                                              '${item.educationDegree.educationDegreeId}', '${item.division.divisionId}',
                                              '${item.user.username}')">S???a
                    </button>
                </div>
                <div class="col-6">
                    <button type="button" id="btnDelete"
                            onclick= "showInfo('${item.employeeId}','${item.employeeName}')"
                            data-toggle="modal" data-target="#deleteModal" class="btn btn-danger btn-outline-danger">X??a
                    </button>
                </div>
            </td>
        </tr>`;
}