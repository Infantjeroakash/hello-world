package mailToPdf;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import com.auxilii.msgparser.Message;
import com.auxilii.msgparser.MsgParser;
import com.auxilii.msgparser.attachment.Attachment;

public class MailToPdf {
	public static void main(String[] args) {
		try {
		MsgParser msgp=new MsgParser();
		Message msg=msgp.parseMsg("C:\\Users\\infant.akash\\Documents\\input_mail.msg");

		String body=msg.getBodyText();

		System.out.println("body "+body);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}