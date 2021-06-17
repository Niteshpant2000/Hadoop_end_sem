

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class IndiaMapper extends Mapper<LongWritable,  Text, Text, IntWritable>

{

	@Override
	protected void map(LongWritable key, Text value,
			org.apache.hadoop.mapreduce.Mapper.Context context)
			throws IOException, InterruptedException {
String inputstring = value.toString();


for(String x : inputstring.split(" "))
	
{	String p=x.toLowerCase();
	if(p.equals("india") || p.equals("india.") || p.equals("india,")){
		context.write(new Text("india"),new IntWritable(1));
		
	}
	
	
	
}
	}

}
