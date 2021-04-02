package ttt;
//下定决心改好TicTacToe，然而又想到了那个“敲代码悖论”
public class game {
	int[][] gameboard=new int[][]{{0,0,0},{0,0,0},{0,0,0}};
	int now=1;
	int state=-1;//welcome:-1,stop:0,palying:1,pause:2
	int won=0;
	int mode=0;
	int first=1;
	String[] winc=new String[]{"111000000","000111000","000000111","100100100","010010010","001001001","001010100","100010001"};
	
	String[] die_win=new String[]{"110000000","011000000","101000000","000110000","000011000","000101000",
			"000000110","000000011","000000101","100100000","000100100","100000100","010010000",
			"000010010","010000010","001001000","000001001","001000001","100010000","000010001",
			"100000001","000010100","001010000","001000100"};
	int[][] pl_ofdw=new int[][]{{0,2},{0,0},{0,1},{1,2},{1,0},{1,1},
								{2,2},{2,0},{2,1},{2,0},{0,0},{1,0},{2,1},
								{0,1},{1,1},{2,2},{0,2},{1,2},{2,2},{0,0},
								{1,1},{0,2},{2,0},{1,1}};
	game(){
		//System.out.println(die_win.length);
		reset();
	}
	void reset(){
		for(int a=0;a<3;a++){
			for(int b=0;b<3;b++){
				//int i=(int)(Math.random()*100)%3;
				//System.out.println(i);
				gameboard[a][b]=0;
			}
		}
		for(;!main.ms.empty();){
			main.ms.pop();
		}
		won=0;
		now=1;
	}
	boolean iswin(){
		//System.out.println("54555");
		block:for(int a=0;a<8;a++){   //o/x win?
			char[] t0=winc[a].toCharArray();
			char[] t1=getcode().toCharArray();
			int counto=0,countx=0;
			for(int b=0;b<9;b++){
				//System.out.println(a+" "+t1[b]+" "+t0[b]);
				if(t1[b]==t0[b]&&t1[b]=='1'){
					counto++;
				}else if(t1[b]-1==t0[b]&&t0[b]=='1'){
					countx++;
				}
				if(counto==3){
					won=1;
					state=0;
					break;
				}else if(countx==3){
					won=2;
					state=0;
					break;
				}
			}
		}
		//System.out.println(000);
		if(state==0){
			mystack ms=new mystack("rec");
			for(;!main.ms0.empty();){
				ms.push(main.ms0.pop());
			}
			StringBuffer sb0=new StringBuffer(first+"*"+won+"*"+new getTime().getHourOfDay()+"时"+new getTime().getMinute()+"分"+new getTime().getSecond()+"秒*");
			for(;!ms.empty();){
				sb0.append(ms.pop()+":");
			}
			new file0().write("record.txt",sb0.toString()+"*"+mode+";", true);
			return true;
		}
		return false;
	}
	boolean will_die_win(){
		mystack player=new mystack("0"),compu=new mystack("1");
		char[] nowc=getcode().toCharArray();
		char[] code;
		int co=0,cx=0;
		for(int a=0;a<24;a++){
			//System.out.println("\n");
			code=die_win[a].toCharArray();
			co=0;cx=0;
			for(int b=0;b<9;b++){
				if(code[b]!='0'&&code[b]==nowc[b]){
					co++;
					//System.out.println("p"+a+" "+co);
				}else if(code[b]!='0'&&code[b]+1==nowc[b]){
					cx++;
					//System.out.println("c"+a+" "+cx);
				}
			}
			if(co>=2)
				player.push(a);
			else if(cx>=2)
				compu.push(a);
		}
		boolean put=false;
		if(!compu.empty()){
			//System.out.println("comu "+!compu.empty());
			for(;!compu.empty();){
				int i=(int)compu.pop();
				if(gameboard[pl_ofdw[i][0]][pl_ofdw[i][1]]==0){
					gameboard[pl_ofdw[i][0]][pl_ofdw[i][1]]=now;
					main.ms0.push(pl_ofdw[i][0]+" "+pl_ofdw[i][1]);
					main.w.d.repaint();
					System.out.println("Program operated");
					main.w.g.setTitle("Tic Tac Toe-Program operated");
					return true;
				}
			}
		}
		if(!player.empty()){
			//System.out.println("play "+(!player.empty()));
			for(;!player.empty();){
				int i=(int)player.pop();
				if(gameboard[pl_ofdw[i][0]][pl_ofdw[i][1]]==0){
					gameboard[pl_ofdw[i][0]][pl_ofdw[i][1]]=now;
					main.ms0.push(pl_ofdw[i][0]+" "+pl_ofdw[i][1]);
					main.w.d.repaint();
					System.out.println("Program operated");
					main.w.g.setTitle("Tic Tac Toe-Program operated");
					return true;
				}
			}
		}
		return false;
	}
	void saveoper(int x,int y){
		if(!main.mode)
			return;
		char[] cod=getcode().toCharArray();
		StringBuffer sb0=new StringBuffer();
		if(now==1){
			for(int a=0;a<9;a++){
				if(cod[a]=='1')
					cod[a]='2';
				else if(cod[a]=='2')
					cod[a]='1';
			}
		}
		for(int a=0;a<9;a++){
			sb0.append(cod[a]);
		}
		String plan=sb0+" "+x+" "+y+";";
		//System.out.println(sb0+" "+plan);
		if(!isex(plan))
			new file0().write("met.txt", plan, true);
	}
	void doai(){
		main.w.d.repaint();
		if(iswin())
			return;
		if(will_die_win())
			return;
		char[] pl=getcode().toCharArray();        //打包当前数据
		/*if(now==2){
			for(int a=0;a<9;a++){
				if(pl[a]=='0')
					continue;
				pl[a]=pl[a]=='1'?'2':'1';
			}
		}*/
		StringBuffer sb0=new StringBuffer();
		for(int a=0;a<9;a++){
			sb0.append(pl[a]);
		}
		//System.out.println(getcode()+" "+sb0+" "+now);
		
		StringBuffer pl0=new StringBuffer(new file0().read("met.txt")); //验证
		String[] pls=pl0.toString().split(";");
		StringBuffer[] pl1=new StringBuffer[pls.length];
		int l=pls.length,isput=0;
		int hasplan=0; //有方案？
		mystack plans=new mystack("ps");
		//System.out.print(l);
		for(int a=0;a<l;a++){
			String s0=pls[a].split(" ")[0];
			StringBuffer b0=new StringBuffer();
			if(s0.equals(sb0.toString())){//||getcode().equals(sb0.toString())
				int i0=Integer.parseInt(pls[a].split(" ")[1]),i1=Integer.parseInt(pls[a].split(" ")[2]);
				if(gameboard[i0][i1]==0){//
					/*gameboard[i0][i1]=now;
					System.out.println("Hurray!AI operated!!");
					main.w.g.setTitle("Tic Tac Toe-AI operated");
					isput=1;
					break;*/
					plans.push(i0+" "+i1);
					hasplan++;
				}/*else if(gameboard[i0][i1]!=0)
					hasplan--;*/
			}
			//System.out.println(a);
		}
		if(hasplan==1){
			String stri=plans.pop().toString();
			gameboard[Integer.parseInt(stri.split(" ")[0])][Integer.parseInt(stri.split(" ")[1])]=now;
			main.ms0.push(Integer.parseInt(stri.split(" ")[0])+" "+Integer.parseInt(stri.split(" ")[1]));
			System.out.println("Hurray!AI operated!!");
			main.w.g.setTitle("Tic Tac Toe-AI operated");
			isput=1;
		}else if(hasplan>1){
			int use=(int)(Math.random()*100)%hasplan+1;
			StringBuffer sb=new StringBuffer();
			for(int a=0;a<use;a++){
				sb=new StringBuffer(plans.pop().toString());
			}
			gameboard[Integer.parseInt(sb.toString().split(" ")[0])][Integer.parseInt(sb.toString().split(" ")[1])]=now;
			main.ms0.push(Integer.parseInt(sb.toString().split(" ")[0])+" "+Integer.parseInt(sb.toString().split(" ")[1]));
			System.out.println("Hurray!AI operated!!");
			main.w.g.setTitle("Tic Tac Toe-AI operated");
			isput=1;
		}
		if(isput==0){         //random
			for(;;){
				int i0=0,i1=0;
				if(main.mode){
					int tx=0,ty=0;
					for(;!isfull();){
						try{
							String str=javax.swing.JOptionPane.showInputDialog(null, "输入放置位置<x>+空格+<y>(输入del使用随机走法):");
							//System.out.println(str);
							if(str.equals("")||str.equals("del"))
								break;
							tx=Integer.parseInt(str.split(" ")[0])-1;
							ty=Integer.parseInt(str.split(" ")[1])-1;
						}catch(Exception e){
							javax.swing.JOptionPane.showMessageDialog(null, "有问题，请重新输入！");
							continue;
						}
						saveoper(tx, ty);
						i0=tx;i1=ty;
						break;
					}
				}
				//System.out.println(i0+" "+i1);
				mystack crnr=new mystack("crnr");
				if(gameboard[0][0]==0)
					crnr.push("0 0");
				else if(gameboard[0][2]==0)
					crnr.push("0 2");
				else if(gameboard[2][0]==0)
					crnr.push("2 0");
				else if(gameboard[2][2]==0)
					crnr.push("2 2");
				if(crnr.count()!=0){
					int cn=(int)(Math.random()*100)%crnr.count()+1;
					StringBuffer data=new StringBuffer();
					for(;cn!=0;){
						data=new StringBuffer(crnr.pop().toString());
						cn--;
					}
					gameboard[Integer.parseInt(data.toString().split(" ")[0])][Integer.parseInt(data.toString().split(" ")[1])]=now;
					main.ms0.push(data);
					System.out.println("random+pgm");
					main.w.g.setTitle("Tic Tac Toe-Random+Pgm");
					break;
				}
				i0=(int)(Math.random()*100)%3;
				i1=(int)(Math.random()*100)%3;
				if(gameboard[i0][i1]==0){
					gameboard[i0][i1]=now;
					main.ms0.push(i0+" "+i1);
					System.out.println("random");
					main.w.g.setTitle("Tic Tac Toe-Random");
					break;
				}
				if(isfull())
					break;
			}
		}
	}
	void putchess(int x,int y){
		if(mode==0){
			saveoper(x,y);
			if(gameboard[x][y]==0){
				gameboard[x][y]=now;
				main.ms.push(x+" "+y);
				main.ms0.push(x+" "+y);
			}else 
				return;
		}else{                                                     //AI
			if(gameboard[x][y]==0){
				gameboard[x][y]=now;
				now=now==1?2:1;
				main.ms0.push(x+" "+y);
			}else
				return;
			if(isfull())
				return;
			doai();
		}
		main.w.d.repaint();                           //who is winner
		now=now==1?2:1;
		iswin();
		if(isfull()&&main.ga.state!=0){
			main.ga.state=0;
			main.ga.won=0;
		}                                         //method finish
	}
	String getcode(){
		StringBuffer str=new StringBuffer();
		for(int a=0;a<3;a++){
			for(int b=0;b<3;b++){
				str.append(gameboard[a][b]);
			}
		}
		//System.out.println(str);
		return str.toString();
	}
	boolean isfull(){
		int flag=0;
		for(int a=0;a<3;a++){
			for(int b=0;b<3;b++){
				if(gameboard[a][b]==0)
					flag=1;
			}
		}
		if(flag==0){
			main.ga.state=0;
			mystack ms=new mystack("rec");
			//System.out.println(main.ms0.empty());
			int a=0;
			for(;!main.ms0.empty();){
				//System.out.println(a++);
				ms.push(main.ms0.pop());
			}
			StringBuffer sb0=new StringBuffer(first+"*"+won+"*"+new getTime().getHourOfDay()+"时"+new getTime().getMinute()+"分"+new getTime().getSecond()+"秒*");
			for(;!ms.empty();){
				sb0.append(ms.pop()+":");
			}
			new file0().write("record.txt",sb0.toString()+"*"+mode+";", true);
			return true;
		}
		return false;
	}
	boolean isex(String pla){
		String[] plans=new file0().read("met.txt").split(";");
		int l=plans.length;
		for(int a=0;a<l;a++){
			if(plans[a].equals(pla))
				return true;
		}
		return false;
	}
}
