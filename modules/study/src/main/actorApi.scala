package lila.study
package actorApi

case class SaveStudy(study: Study)
case class RemoveStudy(id: Study.Id)
case class SetTag(chapterId: Chapter.Id, name: String, value: String) {
  def tag = chess.format.pgn.Tag(name, value take 140)
}
