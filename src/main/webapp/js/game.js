$(document).ready(function () {
    $('#guess-btn').click(function (e) {
        const number = $("#numberValue").val()

        $.ajax({
            method: 'POST',
            url: `http://localhost:8080/api/game?number=${number}`,
            // data
        }) .done(function (data) {
            let suggestString = ""
            if(data.data === "lon") {
                suggestString = "Số bạn đoán lớn hơn kết quả"
            }

            if(data.data === "nho") {
                suggestString = "Số bạn đoán nhỏ hơn kết quả"
            }

            $("#suggestion").content().concat(suggestString)

            if(data.data === "bang") {
                suggestString = "Chúc mừng bạn đã đoán đúng!"
                alert(suggestString)
                $(location).attr('href', '`http://localhost:8080/chart')
            }
        })
    })
})