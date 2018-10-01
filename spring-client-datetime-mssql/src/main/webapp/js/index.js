$(function () {

	$("#datetime-form").on({
		submit: function (event) {
			event.preventDefault();
			event.stopPropagation();
			sendDatetime();
		},
		reset: function (event) {
			event.preventDefault();
			event.stopPropagation();
			clearDatetime();
		}
	});

});

function sendDatetime() {
	// See https://mzl.la/2NdwcfX
	let date = new Date();
	let time = date.getTime();
	let timezoneOffset = date.getTimezoneOffset();
	
	$.ajax({
		type: "POST",
		url: "foo",
		data: {
			date: date,
			time: time,
			timezoneOffset: timezoneOffset
		},
		beforeSend: function (xhr) {
			let $div = $("#datetime-div");
			$div.find("dd.date").text(date);
			$div.find("dd.time").text(time);
			$div.find("dd.timezone-offset").text(timezoneOffset);
		},
		success: function (data, textStatus, jqXHR) {
			console.log(data);
			console.log(textStatus);
			console.log(jqXHR);
			let $div = $("#datetime-div");
			$div.find("pre").text(data);
			$div.show();
		}
	});
}

function clearDatetime() {
	let $div = $("#datetime-div");
	$div.hide();
	$div.find("dd.date").text("");
	$div.find("dd.time").text("");
	$div.find("dd.timezone-offset").text("");
	$div.find("pre").text("");
}