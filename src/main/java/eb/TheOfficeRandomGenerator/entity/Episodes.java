package eb.TheOfficeRandomGenerator.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "office_episodes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Episodes
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "episode_name")
    private String episodeName;

    @Column(name = "season")
    private int season;

    @Column(name = "episode_number")
    private String episodeNumber;

    @Column(name = "episode_description", length = 1500)
    private String episodeDescription;

    @Column(name = "img_url")
    private String imgUrl;
}
