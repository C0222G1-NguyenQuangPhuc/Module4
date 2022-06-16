<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="medical" action="/create" method="post">
    <table>
        <tr>
            <td colspan="6"><h3>TỜ KHAI Y TẾ</h3></td>
        </tr>
        <tr>
            <td colspan="6"><h4>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG CHỐNG DỊCH BỆNH TRUYỀN NHIỄM</h4></td>
        </tr>
        <tr>
            <td colspan="6"><h6>Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lý hình sự</h6></td>
        </tr>
        <tr>
            <td colspan="6">Họ tên (Ghi chữ IN HOA) (*)</td>
        </tr>
        <tr>
            <td colspan="6"><form:input type="text" path="name"/></td>
        </tr>
        <tr>
            <td colspan="2">Năm sinh</td>
            <td colspan="2">Giới tính</td>
            <td colspan="2">Quốc tịch</td>
        </tr>
        <tr>
            <td colspan="2">
                <form:select path="dateOfBirth">
                    <form:options items="${listBirth}"/>
                </form:select>
            </td>
            <td colspan="2">
                <form:select path="gender">
                    <form:options items="${listGender}"/>
                </form:select>
            </td>
            <td colspan="2">
                <form:select path="nationality">
                    <form:options items="${listNationality}"/>
                </form:select>
            </td>
        </tr>
        <tr>
            <td colspan="6">Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác (*)</td>
        </tr>
        <tr>
            <td colspan="6">
                <form:input type="text" path="idCard"/>
            </td>
        </tr>
        <tr>
            <td colspan="6">Thông tin đi lại (*)</td>
        </tr>
        <tr>
            <td colspan="4">
                <form:radiobuttons path="vehicles" items="${listVehicle}"/>
            </td>
        </tr>
        <tr>
            <td colspan="3">Số hiệu phương tiện</td>
            <td colspan="3">Số ghế</td>
        </tr>
        <tr>
            <td colspan="3">
                <form:input type="text" path="numberVehicle"/>
            </td>
            <td colspan="3">
                <form:input type="text" path="seats"/>
            </td>
        </tr>
        <tr>
            <td colspan="3">Ngày khởi hành</td>
            <td colspan="3">Ngày kết thúc</td>
        </tr>
        <tr>
            <td>
                <form:select path="dayStart">
                    <form:options items="${listDay}"/>
                </form:select>
            </td>
            <td>
                <form:select path="monthStart">
                    <form:options items="${listMonth}"/>
                </form:select>
            </td>
            <td>
                <form:select path="yearStart">
                    <form:options items="${listYear}"/>
                </form:select>
            </td>
            <td>
                <form:select path="dayEnd">
                    <form:options items="${listDay}"/>
                </form:select>
            </td>
            <td>
                <form:select path="monthEnd">
                    <form:options items="${listMonth}"/>
                </form:select>
            </td>
            <td>
                <form:select path="yearEnd">
                    <form:options items="${listYear}"/>
                </form:select>
            </td>
        </tr>
        <tr>
            <td colspan="6">Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh/thành phố? (*)</td>
        </tr>
        <tr>
            <td colspan="6">
                <form:textarea path="itinerary"/>
            </td>
        </tr>
    </table>
    <button type="submit">Gửi tờ khai</button>
</form:form>
</body>
</html>
