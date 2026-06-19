package fr.univ_amu.iut.exercice6;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class EnTeteController {

  @FXML private Label labelSousTitre;

  @FXML private Button boutonNouveauSite;

  private Runnable actionNouveauSite = () -> {};

  @FXML
  private void initialize() {
    boutonNouveauSite.setOnAction(e -> actionNouveauSite.run());
    mettreAJourCompteur(0);
  }

  public void mettreAJourCompteur(int nombreSites) {
    if (nombreSites == 0) {
      labelSousTitre.setText("Aucun site déclaré");
    } else if (nombreSites == 1) {
      labelSousTitre.setText("1 site déclaré");
    } else {
      labelSousTitre.setText(nombreSites + " sites déclarés");
    }
  }

  public void setActionNouveauSite(Runnable action) {
    this.actionNouveauSite = action;
  }
}
