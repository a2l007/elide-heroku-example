package lunchvoice.models;

import com.yahoo.elide.annotation.Include;
import org.hibernate.annotations.CreationTimestamp;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

@Include(rootLevel = true, type = "comments")
@Entity
public class LunchComment
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long commentId;

  private String author;

  private String commentText;

  private String diet;

  private Integer upvoteCount;

  private Integer downvoteCount = 0;

  private String location = "Champaign";

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long responseId;

  @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  @CreationTimestamp
  private Timestamp createdOn;

}
