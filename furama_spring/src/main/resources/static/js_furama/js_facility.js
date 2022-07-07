function showInfo(id, name) {
    document.getElementById("confirm").innerHTML = "Chắc chắn xóa dịch vụ có tên <br>" + name;
    document.getElementById("idDelete").value = id;
}

function changeTypeFacility() {

    if (document.getElementById("facility-type").value == "1"){
        document.getElementById("free").value = "";
        document.getElementById("standard").disabled = false;
        document.getElementById("pool-area").disabled = false;
        document.getElementById("floor").disabled = false;
        document.getElementById("free").disabled = true;
    }else if (document.getElementById("facility-type").value == "2"){
        document.getElementById("pool-area").value = "";
        document.getElementById("free").value = "";
        document.getElementById("pool-area").disabled = true;
        document.getElementById("standard").disabled = false;
        document.getElementById("floor").disabled = false;
        document.getElementById("free").disabled = true;
    }else if (document.getElementById("facility-type").value == "3"){
        document.getElementById("pool-area").value = "";
        document.getElementById("standard").value = "";
        document.getElementById("floor").value = "";
        document.getElementById("pool-area").disabled = true;
        document.getElementById("standard").disabled = true;
        document.getElementById("floor").disabled = true;
        document.getElementById("free").disabled = false;
    }
}

function changeTypeFacilityEdit() {

    if (document.getElementById("facility-type-edit").value == "1"){
        document.getElementById("freeEdit").value = "";
        document.getElementById("standardEdit").disabled = false;
        document.getElementById("pool-area-edit").disabled = false;
        document.getElementById("floorEdit").disabled = false;
        document.getElementById("freeEdit").disabled = true;
    }else if (document.getElementById("facility-type-edit").value == "2"){
        document.getElementById("pool-area-edit").value = "";
        document.getElementById("freeEdit").value = "";
        document.getElementById("pool-area-edit").disabled = true;
        document.getElementById("standardEdit").disabled = false;
        document.getElementById("floorEdit").disabled = false;
        document.getElementById("freeEdit").disabled = true;
    }else if (document.getElementById("facility-type-edit").value == "3"){
        document.getElementById("pool-area-edit").value = "";
        document.getElementById("standardEdit").value = "";
        document.getElementById("floorEdit").value = "";
        document.getElementById("pool-area-edit").disabled = true;
        document.getElementById("standardEdit").disabled = true;
        document.getElementById("floorEdit").disabled = true;
        document.getElementById("freeEdit").disabled = false;
    }
}

//Add new
$(document).ready(function () {
    $('#btnAddNew').click(function (event) {
        let name = document.getElementById("nameFacility").value;
        let area = document.getElementById("areaFacility").value;
        let cost = document.getElementById("costFacility").value;
        let max = document.getElementById("max-people").value;
        let rentType = document.getElementById("rent-type").value;
        let fType = document.getElementById("facility-type").value;
        let standard = document.getElementById("standard").value;
        let poolArea = document.getElementById("pool-area").value;
        let floor = document.getElementById("floor").value;
        let free = document.getElementById("free").value;
        let description = document.getElementById("description").value;
        let jsonFacility = {
            facilityName: name,
            facilityArea: area,
            facilityCost: cost,
            maxPeople: max,
            rentType: {
                rentTypeId: rentType
            },
            facilityType: {
                facilityTypeId: fType
            },
            standardRoom: standard,
            description: description,
            poolArea: poolArea,
            numberOfFloor: floor,
            facilityFree: free,
        }
        $.ajax({
            type: 'POST',
            url: '/facility/save',
            data: JSON.stringify(jsonFacility),
            contentType: 'application/json',
            success: function () {
                $('#addModal').modal('hide');
                document.getElementById("nameFacility").value = "";
                document.getElementById("areaFacility").value = "";
                document.getElementById("costFacility").value = "";
                document.getElementById("max-people").value = "";
                document.getElementById("standard").value = "";
                document.getElementById("pool-area").value = "";
                document.getElementById("floor").value = "";
                document.getElementById("free").value = "";
                document.getElementById("description").value = "";
                document.getElementById("bodyMessModal").innerHTML = "Thêm mới thành công";
                $('#messModal').modal('show');
            },
            error: function () {
                document.getElementById("bodyMessModal").innerHTML = "Thất bại";
                $('#messModal').modal('show');
            }
        })
        event.preventDefault();
    })
})

// Function get info edit
function getInfo(id, name, area, cost, max, rentType, fType, standard, description, poolArea, floor, free) {
    document.getElementById("idFacilityEdit").value = id;
    document.getElementById("nameFacilityEdit").value = name;
    document.getElementById("costFacilityEdit").value = cost;
    document.getElementById("max-people-edit").value = max;
    document.getElementById("rent-type-edit").value = rentType;
    document.getElementById("facility-type-edit").value = fType;
    document.getElementById("standardEdit").value = standard;
    document.getElementById("descriptionEdit").value = description;
    document.getElementById("pool-area-edit").value = poolArea;
    document.getElementById("floorEdit").value = floor;
    document.getElementById("freeEdit").value = free;
}

//Edit
$(document).ready(function () {
    $('#btnComfirmEdit').click(function (event) {
        let id = document.getElementById("idFacilityEdit").value;
        let name = document.getElementById("nameFacilityEdit").value;
        let area = document.getElementById("areaFacilityEdit").value;
        let cost = document.getElementById("costFacilityEdit").value;
        let max = document.getElementById("max-people-edit").value;
        let rentType = document.getElementById("rent-type-edit").value;
        let fType = document.getElementById("facility-type-edit").value;
        let standard = document.getElementById("standardEdit").value;
        let poolArea = document.getElementById("pool-area-edit").value;
        let floor = document.getElementById("floorEdit").value;
        let free = document.getElementById("freeEdit").value;
        let description = document.getElementById("descriptionEdit").value;
        let jsonFacilityEdit = {
            facilityId: id,
            facilityName: name,
            facilityArea: area,
            facilityCost: cost,
            maxPeople: max,
            rentType: {
                rentTypeId: rentType
            },
            facilityType: {
                facilityTypeId: fType
            },
            standardRoom: standard,
            description: description,
            poolArea: poolArea,
            numberOfFloor: floor,
            facilityFree: free,
        }
        $.ajax({
            type: 'POST',
            url: '/facility/edit',
            data: JSON.stringify(jsonFacilityEdit),
            contentType: 'application/json',
            success: function () {
                $('#editModal').modal('hide');
                document.getElementById("nameFacility").value = "";
                document.getElementById("areaFacility").value = "";
                document.getElementById("costFacility").value = "";
                document.getElementById("max-people").value = "";
                document.getElementById("standard").value = "";
                document.getElementById("pool-area").value = "";
                document.getElementById("floor").value = "";
                document.getElementById("free").value = "";
                document.getElementById("description").value = "";
                document.getElementById("bodyMessModal").innerHTML = "Chỉnh sửa thành công";
                $('#messModal').modal('show');
            },
            error: function () {
                document.getElementById("bodyMessModal").innerHTML = "Chỉnh sửa thất bại";
                $('#messModal').modal('show');
            }
        })
        event.preventDefault();
    })
})

// Function delete
$(document).ready(function () {
    $('#btnComfirmDelete').click(function (event) {
        let id = document.getElementById("idDelete").value;
        $.ajax({
            type: 'GET',
            url: `/facility/delete/${id}`,
            success: function () {
                $('#deleteModal').modal('hide');
                document.getElementById("bodyMessModal").innerHTML = "Xóa thành công";
                $('#messModal').modal('show');
            },
            error: function () {
                $('#deleteModal').modal('hide');
                document.getElementById("bodyMessModal").innerHTML = "Xóa không thành công";
                $('#messModal').modal('show');
            }
        })
        event.preventDefault();
    })
})