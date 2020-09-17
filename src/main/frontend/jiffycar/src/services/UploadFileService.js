import axios from "axios";

const CAR_IMAGE_UPLOAD_URL = "http://localhost:8080";

class UploadFileService {
  upload(file, onUploadProgress) {
    let formData = new FormData();

    formData.append("file", file);
    return axios.post(CAR_IMAGE_UPLOAD_URL + "/upload", formData, {
      headers: {
        "Content-Type": "multipart/form-data",
      },
      onUploadProgress,
    });
  }
  getFiles() {
    return axios.get(CAR_IMAGE_UPLOAD_URL + "/files");
  }
}

export default new UploadFileService();
