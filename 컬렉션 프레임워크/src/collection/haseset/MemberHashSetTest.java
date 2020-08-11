package collection.haseset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();

		Member memberSo = new Member(1001, "������");
		Member memberLee = new Member(1002, "�̿�ö");
		Member memberKim = new Member(1003, "������");

		memberHashSet.addMember(memberSo);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.showAllMember();

		Member memberAhn = new Member(1003, "�ȿ��");
		memberHashSet.addMember(memberAhn);
		memberHashSet.showAllMember();
	}

}
