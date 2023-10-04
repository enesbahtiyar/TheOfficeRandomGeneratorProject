package eb.TheOfficeRandomGenerator.payloads.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EpisodesResponse
{
    private Long id;

    private String episodeName;

    private int season;

    private String episodeNumber;

    private String episodeDescription;

    private String imgUrl;
}
