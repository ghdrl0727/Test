package Scheduler;

public class PriorityAllocation implements Scheduler {

	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	public void sendCallToAgent() {
		System.out.println("고객 등급에 따라 등급이 높은 고객의 전화를 우선 가져와 업무 능력이 좋은 상담원에게 배분한다.");
	}

}
