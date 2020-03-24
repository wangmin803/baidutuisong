package asdfsaf;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
class MyRadio {
	private JFrame jFrame = new JFrame("wjm");// 定义一个窗体
	private Container container = jFrame.getContentPane();// 得到窗体容器
	private JRadioButton jb1 = new JRadioButton("链接提交");// 定义一个单选按钮
	private JRadioButton jb7 = new JRadioButton("链接更新");// 定义一个单选按钮
	private JRadioButton jb2 = new JRadioButton("MIP提交");// 定义一个单选按钮
	private JRadioButton jb3 = new JRadioButton("AMP提交");// 定义一个单选按钮
	private JRadioButton jb4 = new JRadioButton("熊掌新增提交");// 定义一个单选按钮
	private JRadioButton jb5 = new JRadioButton("熊掌历史提交");// 定义一个单选按钮
	private JRadioButton jb6 = new JRadioButton("神马MIP提交");// 定义一个单选按钮
	
	private static JLabel jlabel1 = new JLabel("网站");
	private static JTextField jtextField1 = new JTextField("http://ykdc.net");
	
	private static JLabel jlabel2 = new JLabel("token");
	private static JTextField jtextField2 = new JTextField("0do1pF16s4plwBKD");
	
	private static JLabel jlabel3 = new JLabel("熊掌ID");
	private static JTextField jtextField3 = new JTextField("1642557801275476");
	
	private static JLabel jlabel4 = new JLabel("熊掌TOKEN");
	private static JTextField jtextField4 = new JTextField("qEboyeNyo1MWVRjK");
	

	private static JLabel jlabel5 = new JLabel("神马mip usename");
	private static JTextField jtextField5 = new JTextField("8991505@qq.com");
	
	private static JLabel jlabel6 = new JLabel("神马mip token");
	private static JTextField jtextField6 = new JTextField("TI_8745bc48dca6e82c8a49c05674dcb955");
	
	private JTextArea jta = new JTextArea("结果显示");
	
	
	JScrollPane scroll = new JScrollPane(jta); 
	
	
		

	private JPanel panel = new JPanel();// /定义一个面板
	private JPanel panel1 = new JPanel();// /定义一个面板
	private JButton developer = new JButton("上传文件");
	private JButton developer1 = new JButton("停止");
	
	
	private static String zdflag="no";
	private static JLabel jlabel14 = new JLabel("");
	
	private static   String  url="";
	private static  String panduan="qqqqqqq";
 
	public MyRadio() {
		
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panel.setBorder(BorderFactory.createTitledBorder("数据提交"));// 定义一个面板的边框显示条
		panel.setLayout(new GridLayout(6, 10));// 定义排版，一行三列
		
		
		panel.add(this.jlabel1);// 加入组件
		panel.add(this.jtextField1);// 加入组件
		panel.add(this.jlabel2);// 加入组件
		panel.add(this.jtextField2);// 加入组件
		panel.add(this.jlabel3);// 加入组件
		panel.add(this.jtextField3);// 加入组件
		panel.add(this.jlabel4);// 加入组件
		panel.add(this.jtextField4);// 加入组件
		
		panel.add(this.jlabel5);// 加入组件
		panel.add(this.jtextField5);// 加入组件
		panel.add(this.jlabel6);// 加入组件
		panel.add(this.jtextField6);// 加入组件
		
		
		panel.add(this.jb1);// 加入组件
		panel.add(this.jb4);// 加入组件
		panel.add(this.jb2);// 加入组件
		panel.add(this.jb3);// 加入组件
		panel.add(this.jb7);// 加入组件
		panel.add(this.jb5);// 加入组件
		panel.add(this.jb6);// 加入组件
		
		
		
		

		panel.add(this.jlabel14);
		
		
		//http://data.zz.baidu.com/update?site=http://ykdc.net&token=eMF5yE1vV5fBasdfeqE
		
		panel1.setBorder(BorderFactory.createTitledBorder("数据提交"));// 定义一个面板的边框显示条
		panel1.setLayout(new GridLayout(1, 2));// 定义排版，一行三列
		panel1.add(scroll);
		
	
		panel.add(this.developer);
		panel.add(this.developer1);
	
		
		

		final ButtonGroup group = new ButtonGroup();
		group.add(this.jb1);
		group.add(this.jb7);
		group.add(this.jb2);
		group.add(this.jb3);
		group.add(this.jb4);
		group.add(this.jb5);
		group.add(this.jb6);

		developer.addMouseListener(new MouseAdapter() {
			
	
			
			
		public void mouseClicked(MouseEvent event) {
			zdflag = "no";
			jta.setText("");
			if(jb1.isSelected()){
				panduan="1";
				url="http://data.zz.baidu.com/urls?site="+jtextField1.getText()+"&token="+jtextField2.getText();
			}
			if(jb7.isSelected()){
				panduan="7";
				url="http://data.zz.baidu.com/update?site=ykdc.net&token="+jtextField2.getText();
			}
			if(jb2.isSelected()){
				panduan="2";
				url="http://data.zz.baidu.com/urls?site="+jtextField1.getText()+"&token="+jtextField2.getText()+"&type=mip";
			}
			if(jb3.isSelected()){
				panduan="3";
				url="http://data.zz.baidu.com/urls?site="+jtextField1.getText()+"&token="+jtextField2.getText()+"&type=amp";
			}
			if(jb4.isSelected()){
				panduan="jb4";
				url="http://data.zz.baidu.com/urls?appid="+jtextField3.getText()+"&token="+jtextField4.getText()+"&type=realtime";
			}
			if(jb5.isSelected()){
				panduan="4";
				url="http://data.zz.baidu.com/urls?appid="+jtextField3.getText()+"&token="+jtextField4.getText()+"&type=batch";
			}
			if(jb6.isSelected()){
				panduan="6";
				url="http://data.zhanzhang.sm.cn/push?site="+jtextField1.getText()+"&user_name="+jtextField5.getText()+"&resource_name=mip_add&token="+jtextField6.getText();
			}
		/*	if(jb8.isSelected()){
				panduan="8";
				url="http://data.zz.baidu.com/urls?site=www.sbzc360.cn&token=eMF5yE1vVSDSD5fBfeqE&type=mip";
						
			
			}
			if(jb81.isSelected()){
				panduan="81";
				url="http://data.zz.baidu.com/urls?site=www.sbzc360.cn&token=eMF5yE1vV5fSDBfeqE";

			}
			if(jb87.isSelected()){
				panduan="87";
				url="http://data.zz.baidu.com/update?site=www.sbzc360.cn&token=eMF5yE1vVSD5fBfeqE";

			}*/
			
			 new Thread() {
	                {
	                    this.setDaemon(true);
	                }
	                public void run() {
	                	 eventOnImport(new JButton(),url,panduan,jta);
	                 
	                }
	               
	            }.start();
			 }});
		
		/*confirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
			}
        });*/
		
		developer1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent event) {
				zdflag = "yes";
			}
			
		});
		
		container.add(panel,BorderLayout.NORTH);// 加入面板
		container.add(panel1,BorderLayout.CENTER);// 加入面板
		this.jFrame.setSize(1000, 590);// 设置窗体大小
		this.jFrame.setVisible(true);// 显示窗体
		this.jFrame.addWindowListener(new WindowAdapter() { // 加入事件监听
					public void windowClosing(WindowEvent arg0) { // 复写窗口关闭的方法
						System.exit(1);// 系统退出
					}
				});
 
	}
	
	
	public static void eventOnImport(JButton developer,String url,String panduan,JTextArea jta) {
String text="";
		try {
			  
			System.out.println(url+"###"+panduan);
			File desktop = new File(System.getProperty("user.home")+System.getProperty("file.separator")+"Desktop");
		  JFileChooser chooser = new JFileChooser(desktop);
		  chooser.setMultiSelectionEnabled(true);
		  int returnVal = chooser.showOpenDialog(developer);
		  
		  if (returnVal == JFileChooser.APPROVE_OPTION) {
			  File[] arrfiles = chooser.getSelectedFiles();
			   if (arrfiles == null || arrfiles.length == 0) {
			    return;
			   }

			   
			   FileReader fr = new FileReader(arrfiles[0]);
			   BufferedReader br = new BufferedReader(fr);
			   
			   int readLineNum = 0;
			   int processCount = 1;
			   String line = "";
		
			   List<String> list = new ArrayList<String> ();
			   while((line = br.readLine()) != null){
				  
		     if(zdflag.equals("no")) {
			   readLineNum ++ ;
         	   list.add(line);

         	   if(panduan.equals("jb4")){
         		  if(readLineNum % 130==0 ){
         			 text+="=====第" + processCount + "次处理开始====="+url+"\r\n";
         			  System.out.println("=====第" + processCount + "次处理开始====="+url);
         			  jta.setText(text);
         	       		jta.paintImmediately(jta.getBounds());  
         			    String[] param =list.toArray(new String[list.size()]);  
         			    Thread.sleep(3000);
         			   String json = Post(url, param,panduan);
         			   list.clear();
         			  text+="=====第" + processCount + "次处理结束====="+json+url+"\r\n";
         			  System.out.println("=====第" + processCount + "次处理结束====="+json+url);
         			  jta.setText(text);
         	       		jta.paintImmediately(jta.getBounds());  
         			   processCount ++;
         	         
         	     }
			   }else{

         		   if(readLineNum % 2000 == 0){
         			  System.out.println("=====第" + processCount + "次处理开始====="+url);
         			 text+="=====第" + processCount + "次处理开始====="+url+"\r\n";
         			  jta.setText(text);
         	       		jta.paintImmediately(jta.getBounds());  
       			    String[] param =list.toArray(new String[list.size()]);  
       			    Thread.sleep(3000);
       			   String json = Post(url, param,panduan);
       			   list.clear();
       			  System.out.println("=====第" + processCount + "次处理结束====="+json+"########"+url);
       			 text+="=====第" + processCount + "次处理结束====="+json+"########"+url+"\r\n";
       		  jta.setText(text);
       		jta.paintImmediately(jta.getBounds());  
       			   processCount ++;
       			   }
         	   }
			   }
		     	   else {
		     		   break;
		     	   }
			   }
			   
		  	   if(zdflag.equals("no")) {
			   if(list!=null&&list.size()>0){
				   System.out.println("=====第" + processCount + "次处理开始====="+url);
				   text+="=====第" + processCount + "次处理开始====="+url+"\r\n";
				   jta.setText(text);
		       		jta.paintImmediately(jta.getBounds());  
      			    String[] param =list.toArray(new String[list.size()]);  
      			    Thread.sleep(3000);
      			   String json = Post(url, param,panduan);
      			   System.out.println(json);
      			   list.clear();
      			 text+="=====第" + processCount + "次处理结束====="+json+"########"+url+"\r\n";
      			  System.out.println("=====第" + processCount + "次处理结束====="+json+"########"+url);
      			  jta.setText(text);
             		jta.paintImmediately(jta.getBounds());  
			   }
		  	   }
			   
			   br.close();
				  
				  fr.close();
				  
			     }
		  
	
		  
		} catch(Exception ex){
			ex.printStackTrace();
		}
		finally {
	
			  System.out.println("=====================处理完毕============");
			  text+="=====================处理完毕============"+"\r\n";
			  jta.setText(text);
	       		jta.paintImmediately(jta.getBounds());  
			  
		}
	}
	
	
	public static String Post(String PostUrl,String[] Parameters,String puanduan){  
        if(null == PostUrl || null == Parameters || Parameters.length ==0){  
            return null;  
        }  
        String result="";  
        PrintWriter out=null;  
        BufferedReader in=null;  
        try {  
            //建立URL之间的连接  
            URLConnection conn=new URL(PostUrl).openConnection();  
            //设置通用的请求属性  
            if(puanduan.equals("5")){
                conn.setRequestProperty("Host","data.zhanzhang.sm.cn"); 
            }else{
                conn.setRequestProperty("Host","data.zz.baidu.com");  
            }
        
            
            conn.setRequestProperty("User-Agent", "curl/7.12.1");  
            conn.setRequestProperty("Content-Length", "83");  
            conn.setRequestProperty("Content-Type", "text/plain");  
               
            //发送POST请求必须设置如下两行  
            conn.setDoInput(true);  
            conn.setDoOutput(true);  
               
            //获取conn对应的输出流  
            out=new PrintWriter(conn.getOutputStream());  
            //发送请求参数  
            String param = "";  
            for(String s : Parameters){  
                param += s+"\n";  
            
            }  
            out.print(param.trim());  
            //进行输出流的缓冲  
            out.flush();  
            //通过BufferedReader输入流来读取Url的响应  
            in=new BufferedReader(new InputStreamReader(conn.getInputStream()));  
            String line;  
            while((line=in.readLine())!= null){  
                result += line;  
            }  
               
        } catch (Exception e) {  
            System.out.println("发送post请求出现异常！"+e);  
            e.printStackTrace();  
        } finally{  
            try{  
                if(out != null){  
                    out.close();  
                }  
                if(in!= null){  
                    in.close();  
                }  
                   
            }catch(IOException ex){  
                ex.printStackTrace();  
            }  
        }  
        return result;  
    }  
}
 



public class JRadioButtonDemo1 {
	public static void main(String[] args) {
		new MyRadio();
	}
}
