package us.pfrommer.insteon.cmd.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public interface Resource {
	public String getName();
	public boolean exists();
	
	public InputStream open() throws IOException;
	
	public class FileResource implements Resource {
		private File m_file;
		
		public FileResource(String s) {
			m_file = new File(s);
		}
		
		public FileResource(File f) {
			m_file = f;
		}
		
		public String getName() {
			return m_file.getName();
		}
		
		public boolean exists() {
			return m_file.exists();
		}
		
		public InputStream open() throws IOException {
			return new FileInputStream(m_file);
		}
	}
}
