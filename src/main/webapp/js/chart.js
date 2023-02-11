$(document).ready(function () {
    $('#btn-reset').click(function (e) {
        $.ajax({
            method: 'POST',
            url: `http://localhost:8080/api/chart/reset`,
            // data
        }) .done(function (data) {
            $(location).attr('href', '`http://localhost:8080/chart')
        })
    })

    $('#btn-play').click(function (e) {
        $(location).attr('href', '`http://localhost:8080/login')
    })
})