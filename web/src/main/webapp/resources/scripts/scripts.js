$(function () {
    $('#end').datepicker();
    var today = new Date();
    var tomorrow = new Date(today.getTime() + 24 * 60 * 60 * 1000);
    $('#start').datepicker({
        minDate: tomorrow,
        onSelect: function (dat) {
            $('#end').datepicker('option', 'minDate', dat);
        }
    });
});

function Selected(a) {
    var country = a.value;
    if (country == "Болгария") {
        document.getElementById("Болгария").style.display = 'inline-block';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Греция") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'inline-block';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Египет") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'inline-block';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Испания") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'inline-block';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Италия") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'inline-block';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Кипр") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'inline-block';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Куба") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'inline-block';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Марокко") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'inline-block';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "ОАЭ") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'inline-block';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Таиланд") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'inline-block';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Турция") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'inline-block';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Черногория") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'inline-block';
    } else {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    }
}