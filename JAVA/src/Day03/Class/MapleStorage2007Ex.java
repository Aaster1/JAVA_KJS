package Day03.Class;

import java.util.Scanner;

public class MapleStorage2007Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Slime slime = new Slime();
		Goblin goblin = new Goblin();
		Ghost ghost = new Ghost();
		SkeletonWalker skWalker = new SkeletonWalker();
		Zombie zombie = new Zombie();
		WildWolf wildWolf = new WildWolf();
		Lizardman lizardman = new Lizardman();
		SkeletonKnight skKnight = new SkeletonKnight();
		SkeletonMage skMage = new SkeletonMage();
		Orc orc = new Orc();
		Ogre ogre = new Ogre();
		Vampire vampire = new Vampire();
		Gorlem gorlem = new Gorlem();
		Lich lich = new Lich();
		Minotauros minotauros = new Minotauros();
		VampireMaster vpMaster = new VampireMaster();
		Manticore manticore = new Manticore();
		Griffon griffon = new Griffon();
		Dragon dragon = new Dragon();
		Behemoth behemoth = new Behemoth();
		Lucifer lucifer = new Lucifer();
		AncientDragon acDragon = new AncientDragon();

		int elixir = 0;
		int statePoint = 0;
		RpgSet state = new RpgSet();
		boolean on = true;
		do {
			System.out.println();
			System.out.println();
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println(state);
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("주사위를 굴려 『초기능력치』를 설정하십시오.");
			System.out.println("[Y/N]");
			String answer = sc.next().toUpperCase();
			if (answer.equals("Y")) {
				int dice = (int) ((Math.random() * 20) + 1);
				if (1 <= dice && dice <= 12) {
					state.STR = 6;
					state.AGI = 6;
					state.INT = 6;
					state.LUCK = 6;
				} else if (13 <= dice && dice <= 19) {
					state.STR = 7;
					state.AGI = 7;
					state.INT = 7;
					state.LUCK = 7;

				} else {
//					가차 버그 갓겜ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
//					1/20 ^N 확률로 사기캐 탄생 버그
//					역시 게임은 버그가 있어야 제맛
					System.out.println("------------------------------------------------------------------------------------------------------------------");
					System.out.println("Congratulations!");
					System.out.println("------------------------------------------------------------------------------------------------------------------");
					state.STR += 10;
					state.AGI += 9;
					state.INT += 11;
					state.LUCK += 13;
				}
			} else if (answer.equals("N")) {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("능력치 설정을 완료하시겠습니까?");
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				String answer2 = sc.next().toUpperCase();
				if (answer2.equals("Y")) {
					on = false;
					System.out.println("------------------------------------------------------------------------------------------------------------------");
					System.out.println("메이플스토리지2007에 오신 것을 환영합니다.");
					System.out.println();
					System.out.println("당신의 능력치는 다음과 같습니다.");
					System.out.println("------------------------------------------------------------------------------------------------------------------");
					System.out.println(state);
					System.out.println("------------------------------------------------------------------------------------------------------------------");
				} else if (answer2.equals("N")) {
					continue;
				}
			} else {
				System.out.println("잘못된 입력입니다");
				continue;

			}

		} while (on);
		boolean life = true;
		do {
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.print("1. 탐색\t");
			System.out.print("2. 휴식\t");
			System.out.println("3. 스테이터스 열람");
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			int action = sc.nextInt();
			if (action == 1) {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("[1티어]");
				System.out.println("[2티어]");
				System.out.println("[3티어]");
				System.out.println("[4티어]");
				System.out.println("[5티어]");
				System.out.println("[6티어]");
				System.out.println("[7티어]");
				System.out.println("진입할 필드/던전을 선택하십시오");
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				int tierNum = sc.nextInt();
				if (tierNum == 1) {
					System.out.println("------------------------------------------------------------------------------------------------------------------");
					System.out.println("["+tierNum+"Tier 던전]에 진입했습니다.");
					System.out.println("------------------------------------------------------------------------------------------------------------------");
					for (int i = 0; i < 5; i++) {
						int encountDice = (int) ((Math.random() * 10) + 1);
						if (encountDice <= 1) {
							System.out.println("------------------------------------------------------------------------------------------------------------------");
							System.out.println("------------------------------------------------------------------------------------------------------------------");
							System.out.println("------------------------------------------------------------------------------------------------------------------");
							System.out.println("------------------------------------------------------------------------------------------------------------------");
							System.out.println("------------------------------------------------------------------------------------------------------------------");
							System.out.println("------------------------------------------------------------------------------------------------------------------");
							System.out.println("보물상자에서 엘릭서[HP, MP 33% 회복]를 획득했습니다.");
							System.out.println("------------------------------------------------------------------------------------------------------------------");
							elixir += 1;
						} else {
							System.out.println("------------------------------------------------------------------------------------------------------------------");
							System.out.println("------------------------------------------------------------------------------------------------------------------");
							System.out.println("------------------------------------------------------------------------------------------------------------------");
							System.out.println("------------------------------------------------------------------------------------------------------------------");
							System.out.println("------------------------------------------------------------------------------------------------------------------");
							System.out.println("------------------------------------------------------------------------------------------------------------------");
							System.out.println(slime.name + "이/가 등장!");
							System.out.println("------------------------------------------------------------------------------------------------------------------");
							boolean fs = true;
							do {
								int defBuff = state.AGI;
								System.out.println("------------------------------------------------------------------------------------------------------------------");
								slime.enermyState();
								System.out.println("------------------------------------------------------------------------------------------------------------------");
								System.out.println();
								System.out.println();
								System.out.println("------------------------------------------------------------------------------------------------------------------");
								state.playerState();
								System.out.println("------------------------------------------------------------------------------------------------------------------");
								System.out.println("1.공격\t 2.가드올리기\t 3.엘릭서 사용\t 4.도망가기");
								System.out.println("------------------------------------------------------------------------------------------------------------------");
								int fightAction = sc.nextInt();
								if (fightAction == 1) {
									int playerAV = (state.STR - ((state.STR * slime.DEF) / 100))
											+ (state.INT - ((state.INT * slime.MDEF) / 100));
									if (playerAV <= 0) {
										playerAV = 0;
									}
									System.out.println("------------------------------------------------------------------------------------------------------------------");
									System.out.println(state.NAME + "의 공격!");
									slime.hp -= playerAV;
									System.out.println();
									System.out.println(playerAV + "의 데미지를 입혔다!");
									System.out.println("------------------------------------------------------------------------------------------------------------------");
									int enermyAV = ((slime.ATK - defBuff) + (slime.MATK - state.INT));
									if (enermyAV <= 0) {
										enermyAV = 0;
									}
									System.out.println("------------------------------------------------------------------------------------------------------------------");
									System.out.println(slime.name + "의 공격!");
									state.HP -= enermyAV;
									System.out.println();
									System.out.println(enermyAV + "의 데미지를 입었다!");
									System.out.println("------------------------------------------------------------------------------------------------------------------");
								} else if (fightAction == 2) {
									defBuff *= 1.2;
									int enermyAV = ((slime.ATK - defBuff) + (slime.MATK - state.INT));
									if (enermyAV <= 0) {
										enermyAV = 0;
									}
									System.out.println("------------------------------------------------------------------------------------------------------------------");
									System.out.println(slime.name + "의 공격!");
									state.HP -= enermyAV;
									System.out.println();
									System.out.println(enermyAV + "의 데미지를 입었다!");
									System.out.println("------------------------------------------------------------------------------------------------------------------");
								} else if (fightAction == 3) {
									elixir -= 1;
									state.HP += (int) (state.MAXHP / 3);
									state.MP += (int) (state.MAXMP / 3);
									if (state.HP > state.MAXHP) {
										state.HP = state.MAXHP;
									}
									if (state.MP > state.MAXMP) {
										state.MP = state.MAXMP;
									}
									System.out.println("------------------------------------------------------------------------------------------------------------------");
									System.out.println("엘릭서를 사용했습니다!");
									System.out.println("HP/MP 33%회복!");
									System.out.println("------------------------------------------------------------------------------------------------------------------");
								} else if (fightAction == 4) {
									int escapeDice = (int) ((Math.random() * 100) + 1);
									escapeDice += state.LUCK;
									if (escapeDice > 50) {
										System.out.println("------------------------------------------------------------------------------------------------------------------");
										System.out.println("도주 성공!");
										System.out.println("------------------------------------------------------------------------------------------------------------------");
										fs = false;
									} else {
										System.out.println("------------------------------------------------------------------------------------------------------------------");
										System.out.println("도주 실패!");
										System.out.println("------------------------------------------------------------------------------------------------------------------");
										int enermyAV = ((slime.ATK - defBuff) + (slime.MATK - state.INT));
										if (enermyAV <= 0) {
											enermyAV = 0;
										}
										System.out.println("------------------------------------------------------------------------------------------------------------------");
										System.out.println(slime.name + "의 공격!");
										state.HP -= enermyAV;
										System.out.println();
										System.out.println(enermyAV + "의 데미지를 입었다!");
										System.out.println("------------------------------------------------------------------------------------------------------------------");
									}
								} else {
									System.out.println("------------------------------------------------------------------------------------------------------------------");
									System.out.println("잘못된 입력입니다.");
									System.out.println("------------------------------------------------------------------------------------------------------------------");
									continue;
								}
								defBuff = state.AGI;
								if (slime.hp <= 0) {
									System.out.println("------------------------------------------------------------------------------------------------------------------");
									System.out.println("전투에서 승리했습니다!");
									System.out.println("------------------------------------------------------------------------------------------------------------------");
									System.out.println();
									System.out.println("------------------------------------------------------------------------------------------------------------------");
									System.out.println(+slime.EXP + "의 경험치를 획득했습니다!");
									state.EXP += slime.EXP;
									while (state.EXP >= state.NEXTEXP) {
										state.EXP = state.EXP - state.NEXTEXP;
										state.LEVEL += 1;
										System.out.println("------------------------------------------------------------------------------------------------------------------");
										System.out.println("레벨이 1 올랐습니다.");
										System.out.println();
										System.out.println("LEVEL : "+state.LEVEL);
										state.MAXHP += 10;
										state.HP = state.MAXHP;
										state.MAXMP += 5;
										state.MP = state.MAXMP;
										System.err.println();
										System.out.println("최대HP가 10 상승했습니다.");
										System.out.println();
										System.out.println("최대MP가 5 상승했습니다.");
										System.out.println();
										statePoint += 1;
										System.out.println("사용 가능한 능력치 투자 점수가 있습니다.");
										System.out.println("------------------------------------------------------------------------------------------------------------------");
										state.NEXTEXP *= 2;
									}
									slime.hp = 50;
									fs=false;
								}
								if (state.HP <= 0) {
									System.out.println("------------------------------------------------------------------------------------------------------------------");
									System.out.println("체력이 0이 되었습니다.");
									System.out.println("------------------------------------------------------------------------------------------------------------------");
									fs = false;
								}
							} while (fs);
							slime.hp = 50;
						}

					}
						
				}
			else if(tierNum==2) {
				
			}
			else if(tierNum==3) {
				
			}
			else if(tierNum==4) {
				
			}
			else if(tierNum==5) {
				
			}
			else if(tierNum==6) {
				
			}
			else if(tierNum==7) {
				
			}
			} else if (action == 2) {
				state.HP += (state.MAXHP * 10) / 100;
				state.MP += (state.MAXHP * 10) / 100;
				if (state.HP > state.MAXHP) {
					state.HP = state.MAXHP;
				}
				if (state.MP > state.MAXMP) {
					state.MP = state.MAXMP;
				}
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("휴식을 취했습니다.");
				System.out.println();
				System.out.println("HP/MP 10% 회복");
				System.out.println("------------------------------------------------------------------------------------------------------------------");
			} else if (action == 3) {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println(state);
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				while (statePoint >= 1) {
					System.out.println();
					System.out.println("------------------------------------------------------------------------------------------------------------------");
					System.out.println("투자 점수 : " + statePoint);
					System.out.println("[1.STR] - 물리공격력");
					System.out.println("[2.AGI] : 물리공격에 대한 경감");
					System.out.println("[3.INT] : 마법공격력 & 마법공격에 대한 경감");
					System.out.println("[4.LUCK] : 도주확률 & 최종 점수치 가산");
					System.out.println("투자할 능력치를 선택하십시오.");
					int doPoint = sc.nextInt();
					if (doPoint == 1) {
						System.out.println("------------------------------------------------------------------------------------------------------------------");
						System.out.println("STR이 1 상승했습니다.");
						System.out.println("------------------------------------------------------------------------------------------------------------------");
						state.STR += 1;
					} else if (doPoint == 2) {
						System.out.println("------------------------------------------------------------------------------------------------------------------");
						System.out.println("AGI이 1 상승했습니다.");
						System.out.println("------------------------------------------------------------------------------------------------------------------");
						state.AGI += 1;
					} else if (doPoint == 3) {
						System.out.println("------------------------------------------------------------------------------------------------------------------");
						System.out.println("INT이 1 상승했습니다.");
						System.out.println("------------------------------------------------------------------------------------------------------------------");
						state.INT += 1;
					} else if (doPoint == 4) {
						System.out.println("------------------------------------------------------------------------------------------------------------------");
						System.out.println("LUCK이 1 상승했습니다.");
						System.out.println("------------------------------------------------------------------------------------------------------------------");
						state.LUCK += 1;
					} else {
						System.out.println("------------------------------------------------------------------------------------------------------------------");
						System.out.println("점수 투자를 보류합니다.");
						System.out.println("------------------------------------------------------------------------------------------------------------------");
						break;
					}

				}
			} else {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("잘못된 입력입니다.");
				System.out.println("------------------------------------------------------------------------------------------------------------------");
			}
			if (state.HP <= 0) {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("생을 마감했습니다...");
				System.out.println("GAME OVER");
				System.out.println("------------------------------------------------------------------------------------------------------------------");
			}
		} while (life);
		sc.close();
	}
}