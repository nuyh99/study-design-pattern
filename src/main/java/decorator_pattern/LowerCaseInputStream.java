package decorator_pattern;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int read = in.read();

        if(read==-1)
            return read;

        return Character.toLowerCase(read);
    }

    @Override
    public int read(byte[] b) throws IOException {
        int read = in.read(b);

        for(int i=0; i<read; i++)
            b[i]=(byte)Character.toLowerCase(b[i]);

        return read;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int read = in.read(b, off, len);

        for(int i=off; i<off+read; i++)
            b[i]=(byte)Character.toLowerCase(b[i]);

        return read;
    }
}
