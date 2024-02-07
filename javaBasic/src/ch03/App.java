package ch03;


class Car { 
	private String vin;
    private String color;
    protected boolean isStart;

   public Car(String vin, String color) {
	 this.vin = vin;
	 this.color = color;
	 this.isStart = false;
		    }
	}
class ManualCar extends Car {
    private int gear;

    public ManualCar(String vin, String color) {
        super(vin, color);
        this.gear = 0;
    }

    public void setGear(int gear) {
        if (gear >= 0 && gear <= 6) {
            this.gear = gear;
            System.out.println("수동 변속기 자동차가 가속합니다!");
        } else {
            System.out.println("수동 변속기 자동차가 정차합니다!");
        }
    }
}
class AutomaticCar extends Car {
    public AutomaticCar(String vin, String color) {
        super(vin, color);
    }
}
			
class Train {
	String trainNumber;
	String departureStation;
	String arrivalStation;
	boolean isStart;
	
	public Train(String trainNumber, String departureStation, String arrivalStation) {
		 this.trainNumber = trainNumber;
	        this.departureStation = departureStation;
	        this.arrivalStation = arrivalStation;
	        this.isStart = false;
	}  
	        public void startTrain() {
	            isStart = true;
	            System.out.println("여객 열차가 천천히 가속합니다!");
	        }

	        public void stopTrain() {
	            isStart = false;
	            System.out.println("여객 열차가 천천히 정차합니다!");
	        }
	   
	    }
	
	
		
			




