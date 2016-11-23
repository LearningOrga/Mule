package dwl;

public class Flight {

	private String airlineJ;
	private int flightPriceJ;
	private String depDateJ;
	private String flightTypeJ;
	private String originJ;
	private String planeCodeJ;
	private int emptySeatJ;
	private String destJ;

	public Flight() {
//default one
	}

	public Flight(String airlineJ, int flightPriceJ, String depDateJ, String flightTypeJ, String originJ,
			String planeCodeJ, int emptySeatJ, String destJ) {
		super();
		this.airlineJ = airlineJ;
		this.flightPriceJ = flightPriceJ;
		this.depDateJ = depDateJ;
		this.flightTypeJ = flightTypeJ;
		this.originJ = originJ;
		this.planeCodeJ = planeCodeJ;
		this.emptySeatJ = emptySeatJ;
		this.destJ = destJ;
	}

	public String getAirlineJ() {
		return airlineJ;
	}

	public void setAirlineJ(String airlineJ) {
		this.airlineJ = airlineJ;
	}

	public int getFlightPriceJ() {
		return flightPriceJ;
	}

	public void setFlightPriceJ(int flightPriceJ) {
		this.flightPriceJ = flightPriceJ;
	}

	public String getDepDateJ() {
		return depDateJ;
	}

	public void setDepDateJ(String depDateJ) {
		this.depDateJ = depDateJ;
	}

	public String getFlightTypeJ() {
		return flightTypeJ;
	}

	public void setFlightTypeJ(String flightTypeJ) {
		this.flightTypeJ = flightTypeJ;
	}

	public String getOriginJ() {
		return originJ;
	}

	public void setOriginJ(String originJ) {
		this.originJ = originJ;
	}

	public String getPlaneCodeJ() {
		return planeCodeJ;
	}

	public void setPlaneCodeJ(String planeCodeJ) {
		this.planeCodeJ = planeCodeJ;
	}

	public int getEmptySeatJ() {
		return emptySeatJ;
	}

	public void setEmptySeatJ(int emptySeatJ) {
		this.emptySeatJ = emptySeatJ;
	}

	public String getDestJ() {
		return destJ;
	}

	public void setDestJ(String destJ) {
		this.destJ = destJ;
	}

	@Override
	public String toString() {
		return "Flight [airlineJ=" + airlineJ + ", flightPriceJ=" + flightPriceJ + ", depDateJ=" + depDateJ
				+ ", flightTypeJ=" + flightTypeJ + ", originJ=" + originJ + ", planeCodeJ=" + planeCodeJ
				+ ", emptySeatJ=" + emptySeatJ + ", destJ=" + destJ + "]";
	}

}
