package SelecaoAtributos;

public interface ProgressListener {
	public void incrementProgress(int amount);
	public void setProgress(int progress);
	public void setExpectedProgress(int expected);
	public void setMessage(String message);
	public void done();
}
