package ReadNCharactersGivenRead4;

/* The read4 API is defined in the parent class Reader4.
int read4(char[] buf); */

public class Solution extends Read4{
/**
* @param buf Destination buffer
* @param n   Maximum number of characters to read
* @return    The number of characters read
*/
	public int read(char[] buf, int n) {
		char[] buffer = new char[4];
		boolean EOF = false;
		int readBytes = 0;
		while(!EOF && readBytes < n) {
			int sz = read4(buffer);
			if(sz < 4) EOF = true;
			int bytes = Math.min(sz, n - readBytes);
			System.arraycopy(buffer, 0, buf, readBytes, bytes);
			readBytes += bytes;
		}
		return readBytes;
	}
}
