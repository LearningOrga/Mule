%dw 1.0
//%output application/java
%output application/json
---
payload.flights.*flight map {
	airlineJ: $.airlineJ,
	flightPriceJ: $.flightPriceJ,
	depDateJ: $.depDateJ,
	flightTypeJ: $.flightTypeJ,
	originJ: $.originJ,
	planeCodeJ: $.planeCodeJ,
	emptySeatJ : $.emptySeatJ,
	destJ: $.@destJ,
	rootTagAttribute:  {
		"size" : payload.flights.@size,
		"test": payload.flights.@test	
	}
	//rootTagAttribute: payload.flights.@size ++ payload.flights.@test	
}
