package test;

public class TransportExam {
	
	public static void main(String[] args) {
		Car c1 = new Car("디젤", 5);
		Car c2 = new Car("가스", 110);
		
		c1.refuel();
		c2.refuel();
		c1.speedDown();
		c2.speedUp();
		
		Airplane a1 = new Airplane("보잉 747", 10000, 1000);
		Airplane a2 = new Airplane("에어버스 380", 20000, 5000);
		Airplane a3 = new Airplane("보잉 707", 10000, 5000);
		
		a1.refuel();
		a2.refuel();
		a3.refuel();
		a1.fligthTime();
		a2.fligthTime();
		a1.speedDown();
		a2.speedUp();
		
	}
	
}

abstract class Transport {
	abstract void refuel();
	abstract void speedUp();
	abstract void speedDown();
}

class Car extends Transport {
	String oilType;
	int speed;
	
	public Car() {}
	public Car(String oilType, int speed) {
		this.oilType = oilType;
		this.speed = speed;
	}

	@Override
	void refuel() {
		switch (oilType) {
		case "디젤": {
			System.out.println(oilType + "을 주유합니다");
			break;
		}
		case "가스": {
			System.out.println(oilType + "를 주입합니다");
			break;
		}
		case "전기": {
			System.out.println(oilType + "를 충전합니다");
			break;
		}
		case "태양열": {
			System.out.println(oilType + "을 충전합니다");
			break;
		}
		default:
			System.out.println("휘발유를 주유합니다");
		}
	}

	@Override
	void speedUp() {
		speed += 10;
		if(speed>110) {
			System.out.println("속력위반 범칙금 10만원을 부과합니다");
			speed = 10;
		}
	}

	@Override
	void speedDown() {
		speed -= 10;
		if(speed<=0) {
			System.out.println("차가 멈췼습니다");
			speed = 10;
		}
	}
	
}

 class Airplane extends Transport {
	String airplaneName;
	int distance, speed;
	static double totalJetFuel = 1500;
	double jetFuel;
	
	public Airplane() {}
	public Airplane(String airplaneName, int distance, int speed) {
		super();
		this.airplaneName = airplaneName;
		this.distance = distance;
		this.speed = speed;
	}

	@Override
	void refuel() {
		jetFuel = distance / 20;
		if(jetFuel<=totalJetFuel) {
			System.out.println("항공유 " + jetFuel + "L를 주유합니다");
			totalJetFuel -= jetFuel;
		} else {
			System.out.println("항공유가 부족하여 주유할수 없습니다");
		}
	}

	@Override
	void speedUp() {
		speed += 1000;
		if(speed>5500) {
			System.out.println("비행 속도는 5500km를 넘을 수 없습니다");
			speed = 5500;
		}
	}

	@Override
	void speedDown() {
		speed -= 1000;
		if(speed<=0) {
			System.out.println("비행기가 멈췄습니다");
			speed = 10;
		}
	}
	
	void fligthTime() {
		System.out.println(airplaneName + "의 비행시간은 " + (double)distance/(double)speed + "시간 입니다");
	}
	
}
