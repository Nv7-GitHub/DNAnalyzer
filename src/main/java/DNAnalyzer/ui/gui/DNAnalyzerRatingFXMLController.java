package DNAnalyzer.ui.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.controlsfx.control.Rating;

import javafx.scene.control.TextArea;

/**
 * This class is the controller for the DNAnalyzerRatingFXML.fxml file
 */
public class DNAnalyzerRatingFXMLController {

    @FXML
    private Rating dnaRating=null;

    @FXML
    private TextArea dnaRatingTxt= null;

    /**
     * Handles the btnSubmitClicked event
     *
     * @param event
     */
    @FXML
    private void btnSubmitClicked(ActionEvent event) {
        double rating = dnaRating.getRating();
        String ratingTxt = dnaRatingTxt.getText();
        System.out.print("Rating:"+rating + " " + ratingTxt);
    }
}
