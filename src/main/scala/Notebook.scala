import org.apache.spark.SparkContext
import org.apache.spark.sql.{SQLContext, SparkSession}
import org.apache.zeppelin.spark.ZeppelinContext

object Notebook {

  val sc: SparkContext = ???

  val sqlContext: SQLContext = ???
  import sqlContext.implicits._

  val spark: SparkSession = ???
  import spark.implicits._

  val z: ZeppelinContext = ???

  //

}
