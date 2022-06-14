<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .content{
            width: auto;
            justify-content: center;
        }
        form{
            width: 300px;
            display: flex;
            justify-content: center;
            box-sizing: border-box;
            margin: auto;
            padding: 0;
            background-color: bisque;
        }
        .button-submit{
            display: flex;
            justify-content: center;
        }
        #btn-submit{
            width: 8em;
        }
    </style>
</head>
<body>
    <div class="content">
        <form action="/search" method="post">
            <table>
                <tr>
                    <th colspan="2">
                        <caption>
                            <h2>Simple Dictionary</h2>
                        </caption>
                    </th>
                </tr>
                <tr>
                    <th>Keyword:</th>
                    <td><input type="text" value="${keyword}" name="keyword" placeholder="Input word want to search"></td>
                </tr>
                <tr>
                    <th>Result:</th>
                    <td><input type="text" value="${result}" readonly></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <div class="button-submit">
                            <input id="btn-submit" type="submit" style="align-items: center" value="Search">
                        </div>
                    </td>
                </tr>
            </table>

        </form>
    </div>
</body>
</html>
